    class Swapper3_error { // from Cucumber acceptance tests aa_valueNames.feature

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
    }
    means(startingA' = 'a && a' = 'b && b' = startingA');
       // startingA' is out of scope
       // because it's variable is declared inside the block

    } // end class
