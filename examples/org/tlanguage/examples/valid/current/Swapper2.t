    class Swapper2 { // from Cucumber acceptance tests aa_valueNames.feature

    int 'a =1, 'b = 2; // fields may be given initial values, as in Java

    void swap() {
      a' = 'b;
      b' = 'a;         // b' may be reused because it is still in scope
    }

    } // end class
