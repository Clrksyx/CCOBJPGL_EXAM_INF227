public class Ilocos implements Locations { 

    int airFare = 180;

    public void accept(Tourist tourist) {
        tourist.visit(this);


    }
    
}