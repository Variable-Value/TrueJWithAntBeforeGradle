/* Solution.t
*/
package org.conceptcomputing.pharacologicCalc.dosage;

/**
*/
public serial class Solution {
   Unique(StockID);
   public string StockID;
   public Drug drug;    
   public approxFloat drugGrams {drugGrams = concentration * solutionLiters;}
   public approxFloat solutionLiters {
         solutionLiters = drugGrams / concentration
   } 
   public approxFloat solutinMiliiters {
      solutonMiliLiters = solutionLiters * 1000;
   }
   // solvent is assumed to be isotonic saline
   public approxFloat concentration { 
         concentration = drugGrams / solutionMililiters;
   }
   public approxFloat concentrationPct {
         concentrationPct = drugGrams / (100*solutionMililiters);
   }
   public approxFloat molarity {molarity = concentration/drug.molWgt}
   public Solution fromStock ;
   public approxFloat stockLiters;
   public approxFloat stockMililiters {stockLiters = 1000*stockMililiters;}
   public approxFloat isotonicSalineLiters;

   Solution Saline = new Solution {
      drug = NaCl;
      drugGrams = NaCl.molWGt;
      solutionLiters = 1.0;
   }

   public fn Solution DesiredSolution 

   test 1(+-.001) {
      result = Saline.molarity;
   }
} // end class Solution
