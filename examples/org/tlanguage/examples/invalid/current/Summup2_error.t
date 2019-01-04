    class Summup2_error { // from Cucumber acceptance tests aa_valueNames.feature

    int theSum;

    void sum1to3() {
      'theSum     = 0;
      theSum'temp = 'theSum     + 1;
      theSum'temp = theSum'temp + 2; // error here
      theSum'     = theSum'temp + 3;
    }
    means(theSum' = 1 + 2 + 3);

    } // end class
