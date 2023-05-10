public class Albay implements Locations { 

    int airFare = 270;

    public void accept(Tourist tourist) {
        tourist.visit(this);


    }
    
}