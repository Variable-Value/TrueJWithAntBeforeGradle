    class AllTrue2_error { // from Cucumber acceptance tests aa_valueNames.feature

    boolean a;
    boolean b;
    boolean c;

    boolean allTrue;

    void checkAll() {
      allTrue'reset = true;
      allTrue'temp  = allTrue'reset && 'a;
      allTrue'temp  = allTrue'temp  && 'b;
      allTrue'      = allTrue'temp  && 'c;
    }
    means(allTrue' = 'a && 'b && 'c);

    } // end class
