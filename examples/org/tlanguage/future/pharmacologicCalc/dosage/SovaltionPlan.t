/* SolvationPlan.t
*/
package package org.conceptcomputing.pharacologicCalc.dosage;

/**
*/
public serial class SolvationPlan {
   public Solution newSolution;
   public Solution fromStock {fromStock.drug = newSolution.drug;}

   public approxFloat distilledWaterMiliLitersNeeded;
   public approxFloat stockMiliLitersNeeded;
   public approxFloat NaCl_gNeeded;

   test "phenylephrine hydrochloride plan" true {  // suite
      Drug phenylephrineHydrochloride = new Drug() { 
         ID = "phenylephrine hydrochloride";
         molWgt = 204;
         numIons = 2;
      }
      Solution stock_1pct = new Solution {
         drug = phenylephrineHydrochloride;
         concentrationPct = 1;
      }
      Solution desired = new Solution {
         drug = phenylephrineHydrochloride;
         molarity = .01;
         solutionMiliLiters = 25;
         fromStock = stock_1pct;
      }
      SolvationPlan plan = new SolvationPlan {
         newSolution = desired;
         fromStock = stock_1pct;
      }
      test 19.9(+-.0001) {result = plan.distilledWaterMiliLitersNeeded}
      test 5.1(+-.0001)  {result = plan.stockMiliLitersNeeded}
      test 210(+-.0001)  {result = plan.NaCl_gNeeded}
   }
   test "Solvation Plan suite" {
      test "test suite" in Drug;
      test "phenylephrine hydrochloride plan";
   }

} // end class SolvationPlan
