package decorator;

public class CheeseDecorator implements Food {
    private Food food;

    public CheeseDecorator(Food food) {
        this.food = food;
    }

    @Override
    public int cost() {
        return food.cost() + 20;
    }

    @Override
    public String description() {
        return food.description() + " + Cheese";
    }
}