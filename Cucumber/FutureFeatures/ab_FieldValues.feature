Feature: Class field names have class scope

  In the T language, as in Java, variables declared as class-level components 
  are called fields. Components use fields to change states, query state, or 
  make claims about the state of an object; actually, in the T language, it is 
  always the field value names and not the names of the field variables that are 
  referenced by other components.

  At the start of a process, such as a method, constructor, or initializer
  block, the value contained in a variable is named by pre-decorating the
  variable name with an apostrophe, e.g., 'var. And at the finish of the
  process, by post-decorating, e.g., var'. If the variable also receives
  intermediate values during the process, the variable name is mid-decorated by
  appending an apostrophe and a distinguishing sequence of identifier 
  continuation characters, e.g., ranking'1stPeriod.

  Some object components do not change the value of a field they reference, but
  we still wish to indicate that we are dealing with values and not variables.
  Rather than invent a separate style of decoration for these unchanging
  variables, we consider that in a process, a pre-decorated value name indicates
  that the variable may change and a post-decorated value name indicates that
  the variable is done changing. Since it is not far from "is done changing" to
  "will not change", we use the post-decorated form of the variable name to
  indicate these unchanging values.

Scenario: Collect field variable names.

  Field names must be collected for a class in a form that will be used by a
  the semantics checker.

  Given the T Language run unit "Swapper" is
    """
    class Swapper {

    int a, 'b = 1;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means(startingA' = 'a && a' = 'b && b' = startingA');
    }
    means(a' = 'b && b' = 'a);

    class InnerSwapper {
	  int 'c = 0, d;

	  void innerSwap() {
	    int startingA' = 'a;
	    a' = 'c;
	    int startingB' = 'b;
	    b' = 'd;
	    c' = startingA';
	    d' = startingB';
	  }
	  means(a' = 'c && b' = 'd && c' = 'a && d' = 'b);
	} // end nested class InnerSwapper

    } // end class Swapper
    """

  Then the field name collection is
    """
    [[Swapper, [a, b]], [Swapper.InnerSwapper, [c, d]]]
    """

Scenario: Collect field variable names for enum classes.

  We the Java syntax for enumerations as the basis of T enumerations. The Java
  representation of enumerations as singletob classes is very elegant, but it
  leads to a lot of capability that is seldom used. We check those details here.

  Given the T Language run unit "Swapper" is
    """
	public enum EnumA {
	  A1 {
	    String a1a;
	    String a1b' = "abc";

	    public void a1Method() {
	      a1a' = 'enumAa;
	      enumAa' = 'a1a;
	    }
	  }
	, A2 {
	    String 'a2a = "def";
	    String a2b;
	  }
	;
	  String enumAa;
	  String enumAb' = "xyz";

	  public void enumAMethod() {
	    enumAa' = enunAb';
	  }
	}
    """

  Then the field name collection is
    """
    [[EnumA, [EnumAa, EnumAb]], [A1, [a1a, a1b]], [A2, [a2a, a2z]]]
    """

  And the Java operational run unit is
    """
    public enum EnumA {
      A1 {
        String a1a;
        String a1b/*'*/ = "abc";

        public void a1Method() {
          $T$a1a = /*'*/a1a';
          a1a/*'*/ = /*'*/enumAa;
          enumAa/*'*/ = $T$a1a;
        }
      }
    , A2 {
        String /*'*/a2a = "def";
        String a2b;
      }
    ;
      String enumAa;
      String enumAb/*'*/ = "xyz";

      public void enumAMethod() {
        enumAa/*'*/ = enunAb/*'*/;
      }
    }
    """

  And the formal logic for the prover is
    """
    class scope: EnumA
      type: _enumAa :=<: String .
      type: _enumAb :=<: String .
      assert _enumAb_t_ = "xyz" .

      class scope: A1
        type: _a1a :=<: String .
        type: _a1b :=<: String .
        assert _a1b_t_ = "abc" .

        method scope: a1Method()
          assert: a1a_t_ = _t_enumAa .
          assert: enumAa_t_ = _t_a1a .
        method scope means: a1a_t_ = _t_enumAa and enumAa_t_ = _t_a1a .

      end class scope: A1

      class scope: A2
        type: _a2a :=<: String .
        assert _t_a2a = "def" .
        type: _a2b :=<: String .
      end class scope: A2

      method scope: enumAMethod()
        assert: enumAa_t_ = _enunAb_t_ .
      method scope means: enumAa_t_ = _enunAb_t_ .

    end class scope: EnumA
    """



