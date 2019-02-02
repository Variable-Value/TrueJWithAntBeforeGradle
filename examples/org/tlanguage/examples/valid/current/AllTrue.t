    class AllTrue { // from Cucumber acceptance tests aa_valueNames.feature

    boolean a;
    boolean b;
    boolean c;

    boolean allTrue;

    void checkAll() {
      allTrue'reset = true;
      allTrue'thruA = allTrue'reset && 'a; // assignment is sticker than &&
      allTrue'thruB = allTrue'thruA && 'b;
      allTrue'      = allTrue'thruB && 'c;
    }
    means(allTrue' = ('a && 'b && 'c));    // equality is stickier than &&

    } // end class
