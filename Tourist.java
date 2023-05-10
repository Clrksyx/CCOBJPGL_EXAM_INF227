interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bohol bohol);
    void visit(ElNido elnido);
    void visit(Baguio baguio);
    void visit(Ilocos ilocos);
    void visit(Cebu cebu);
    void visit(Albay albay);
    
    default void visit(Locations locations) {
        System.out.println("Arrived at the locations");
    };

    void checkBudget();

}
