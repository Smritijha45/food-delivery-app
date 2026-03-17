package factory;

import models.Customer;
import models.User;

public class UserFactory {
    public static User createUser(String type, String name) {
        if (type.equalsIgnoreCase("customer")) {
            return new Customer(name);
        }
        return null;
    }
}