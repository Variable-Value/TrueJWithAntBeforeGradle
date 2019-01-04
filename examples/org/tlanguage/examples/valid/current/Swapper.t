    class Swapper { // from Cucumber acceptance tests aa_valueNames.feature

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means(startingA' = 'a && a' = 'b && b' = startingA');
    }
    means(a' = 'b && b' = 'a);

    } // end class
