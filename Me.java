public class Me implements Tourist {
      
    static int budget = 1000;

    public void visit() {
        System.out.print("I'm having a good time here.");
    }

    public void visit(Bohol bohol) {
 if (bohol.airFare > budget ){
        System.out.println("Pasensya na boss pero kinulang yung pera mo para makapunta ng bohol. ");
}
 else{
        System.out.println("Sa wakas nakarating din dito sa bohol! ");
        budget = budget - bohol.airFare;   
}
        checkBudget();
    }

    public void visit(ElNido elnido) {
 if (elnido.airFare > budget){
        System.out.println("I'm so sorry sir hindi po kaya ng budget niyo para makarating ng elnido.");
}
 else{
        System.out.println("Hala hindi ko akalain na makakapunta ako dito sa elnido!!");
        budget = budget - elnido.airFare;
}
        checkBudget();
    }

    public void visit(Baguio baguio) {
  if (baguio.airFare > budget){
        System.out.println("Sorry boss hindi kasya pamasahe mo papuntang baguio.");
}
 else{
        System.out.println("Nandito na'ko sa baguio!!!");
        budget = budget - baguio.airFare;
}
        checkBudget(); 
    }

    public void visit(Ilocos ilocos) {
  if (ilocos.airFare > budget){
        System.out.println("Pasensya na boss pero kinulang yung pera mo para makapunta ng ilocos.");
}
 else{
        System.out.println("Sa wakas nakarating din dito sa ilocos!");
        budget = budget - ilocos.airFare;
}
        checkBudget();
   
    }

    public void visit(Cebu cebu) {
   if (cebu.airFare > budget){
        System.out.println("I'm so sorry sir hindi po kaya ng budget niyo para makarating ng cebu.");
}
 else{
        System.out.println("Hala hindi ko akalain na makakapunta ako dito sa cebu!!");
        budget = budget - cebu.airFare;
}
        checkBudget();
       
    }
    public void visit(Albay albay) {
   if (albay.airFare > budget){
        System.out.println("Pasensya na boss pero kinulang yung pera mo para makapunta ng albay.");
}
 else{
        System.out.println(" wakas nakarating din dito sa albay!");
        budget = budget - albay.airFare;
}
        checkBudget();
        
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}