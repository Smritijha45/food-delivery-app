import factory.UserFactory;
import models.User;
import strategy.*;
import decorator.*;
import models.Order;
import observer.*;

public class Main {
    public static void main(String[] args) {

        // 1. Factory Pattern
        User user = UserFactory.createUser("customer", "Smriti");
        user.showRole();

        // 2. Decorator Pattern
        Food food = new Burger();
        food = new CheeseDecorator(food);

        System.out.println("Order: " + food.description());
        System.out.println("Total Cost: ₹" + food.cost());

        // 3. Strategy Pattern
        PaymentStrategy payment = new UpiPayment();
        payment.pay(food.cost());

        // 4. Observer Pattern
        Order order = new Order();
        Observer obs1 = new OrderObserver("Smriti");

        order.addObserver(obs1);

        order.setStatus("Preparing");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");
    }
}