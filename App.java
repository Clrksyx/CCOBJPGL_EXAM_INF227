import javax.swing.plaf.basic.BasicToggleButtonUI;

public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Bohol bohol = new Bohol ();
        ElNido elnido = new ElNido();
        Baguio baguio = new Baguio();
        Ilocos ilocos = new Ilocos();
        Cebu cebu = new Cebu();
        Albay albay = new Albay();

        Me tourist = new Me();
        
        bohol.accept(tourist);
        elnido.accept(tourist);
        baguio.accept(tourist);
        ilocos.accept(tourist);
        cebu.accept(tourist);
        albay.accept(tourist);

        



        
    }
}
