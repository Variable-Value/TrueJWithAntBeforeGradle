/* Compound.t
*/
package org.conceptcomputing.pharacologicCalc.dosage;

/** Compound class for
    "Procedure 1 - Dosage and Concentration: Drug Stock Solutions",
    from Ronald J. Tallarida and Rodney B. Murray, 
    <em>Manual of Pharmacologic Calculations</em>, Springer-Verlog, New York, 
    1987??, pp. 3-7.
*/
public serial quiet class Compound {
   unique(ID);
   public String ID;
   public approx molWgt { molWgt > 0; }
   public int numIons {numIons >=0; numIons <= 5; } 
   public boolean isElectrolyte {isElectrolyte = (numIons > 1);}
   public approx dissociationFactor;
   public approx NaClEquivalent {
      NaClEquivalent = (NaCl.molWgt / NaCl.dissociationFactor)  // numerator
                     / (this.molWgt / this.dissociationFactor); // denominator
   }

   constraint constrainDissociationFactor { 
      // could have been stated with dissociationFactor definition
      if (isElectrolyte) {
         dissociationFactor = .2 + .8 * numIons;
      } else {
         dissociationFactor = 1.0;
      }
   } 

// Constructors
   public Compound();

   public Compound(ID, molWgt, numIons) {
      this.ID = ID;
      this.molWgt = molWgt; 
      this.numIons = numIons;
      /* constraint(aConstraintName) as a command hangs unless all the 
         constraint's dependent
         variables are defined, therefore they must be done in this order 
      */
      constraint(isElectrolyte);               // numIons must be defined
      constraint(constrainDissociationFactor); // isElectrolyte must be defined
      constraint(NaClEquivalent);              // dissociationFactor must be defined
   }
// Predefined compounds Compounds
   public Compound NaCl = new Compound {
      "NaCl",    // ID
      58.44247, // molWgt = Na.atomWgt + Cl.atomWgt
      2         // numIons
   }

   test false {
      Compound d = new Compound("test", 2, 2);
      d.molWgt = 4.0; // cannot be set to 4.0 because already set to 2.0, 
                      // 4.0 != 2.0, therefore overconstrained
   }
   test true  {int openNumIons; Compound d = new Compound("test", 3, openNumIons);}
   test false {Compound d = new Compound("test", 3, 6);} 
      // numIons >5, therefore compiler catches
   test true  {Compound d = new Compound("test", 3, 5);}
   test false {
      Compound d = new Compound();
      d.isElectrolyte; // d.isElectrolyte is set to true
      // d.isElectrolyte constraint passes because d.numIons might be set to 2
      d.numIons = 0;
      // d.numIons constraint is true
      // d.isElectrolyte constraint is false ** COMPILER CATCHES IT HERE **
      d.ID = "never get to here";
   }
   test false  {
      Compound d = new Compound();
      d.numIons = 0;
      // d.numIons constraint is OK
      // implies that d.isElectrolyte is false 
      // still OK
      d.electrolyte; // same as    d.electrolyte=true;
      // d.electrolyte is overconstrained, cannot be both true and false
      // ** COMPILER CATCHES IT HERE **
      d.ID = "test";
   }
   test false { 
      Compound d = new Compound();
      numIons = 2;
      ! d.electrolyte; // same as    d.electrolyte=false;
      // d.electrolyte constraint fails in compiler
   }
   test false  {  
      Compound d = new Compound();
      d.dissociationFactor = 2.8;
      // compiler can prove that this is invalid
      // *** PROOF ***
      // { if (isElectrolyte) {
      //      dissociationFactor = .2 + .8 * numIons;
      // } else {
      //      dissociationFactor = 1.0;
      // }
      // isElectrolyte is boolean THEREFORE EITHER
      // dissociationFactor = 1.0
      // OR dissociationFactor = .2 + .8 * numIons
      // The first is false.
      // numIons is a range-bound integer, so it is enumerated
      // none of the values for numIons leads to d.dissociationFactor = 2.8
      // QED

      // But compilers are not required to test range-bound integer values,
      // so we don't insist that the compiler catch the error.
      // Therefore some compilers would report FALSE
      // others would report OK SO FAR

      // To fill this gap in correctness, all compilers that conclude a 
      // definite value based on a test of other than all possible boolean
      // values, must insert a conjecture
      // stating the definite value into the source, e.g., 

         // conjecture(false); // inserted by compiler XX.X

      // This ensures that we will never have programs that compiled on one
      // compiler, but now they don't compile anymore.

      // Furthermore, if a method is not declared quiet, then it cannot be 
      // passed any objects with unverified constraints.  Therefore only objects
      // that are known to be OK can be observed. Note that if a class is 
      // declared quiet, then all its methods are quiet, and also that native
      // Java routines may be called by conjecturing that they are quiet 
      // where they are called, e.g.,
      // conjecture {quiet(Integer.parse();}
   }
   test false  {  
      int numIons;
      approx molWgt;
      Compound d = new Compound("test", molWgt, numIons);
      // Fails on attempt to verify constraint(numIons) in constructor
   }
   test false  {  
      Compound d = new Compound();
      d.dissociationFactor = 2.6;
      d.numIons = 3;
      // we arrive at the end of the block so the constraints of d are tested
      // d.electrolyte is set to true
      // d.dissociatinFactor = .2 + .8 * numIons = 2.6,
      //    but because of approx (floating point) rounding error this does not equal 
      //    exactly 2.6, therefore the constraints of d are FALSE
   }
   private boolean approximates(approx a, approx b, approx tollerance) {
      a - tollerance <= b;
      a + tollerance >= b;
      // a boolean function does not require a returns statement
      // if it fails, it returns false
      // However, it is OK to put in the following:
      returns(true);
   }
   test false  {  
      Compound d = new Compound();
      numIons = 3;
      constraint(d.isElectrolyte);
      constraint(d.constrainDissociationFactor);
      approximates(dissociationFactor,2.6,.01); 
   }
   test true {NaCl.isElectrolyte}
   test 58.4425+-.0001 {result = NaCl.molWgt} // 58.44247
   test 1.0(+-0.01) {result = NaCl.dissociationFactor}
   test 1.0(+-0.01) {result = NaCl.NaClEquivalent}
   test "Factor for 2 ions" 1.8(+-.001)  { 
      // avoid invoking all tests by using
      // tc org.tlanguage.examples.pharacologicCalc.dosage.Compound \
      //    -test "Factor for 2 ions"
      // test everything but this by using
      // tc org.tlanguage.examples.pharacologicCalc.dosage.Compound \
      //    -notest "Factor for 2 ions"
      Compound d = new Compound();
      numIons = 2;
      valid(d);
      result = d.dissociationFactor;
   }
   test "phenylephrine hydrochloride" true {  // suite
      Compound d = new Compound() { 
         ID = "phenylephrine hydrochloride";
         molWgt = 204 grEquiv;
         numIons = 2 ions;
      }
      test 1.8       {result = d.dissociationFactor}
      test 0.29 gm   {result = d.NaClEquivalent}
      // but a test cannot be used in a method or constraint
   }
   test "test suite" true { 
      // invoke by using 
      // tc org.tlanguage.examples.pharacologicCalc.dosage.Compound \
      //    -nocompile -novalidation -test "test suite"
      test "Factor for 2 ions";
      test "phenylephrine hydrochloride";
   }
} // end class Compound
