package decorator;

public class Burger implements Food {

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Burger";
    }
}