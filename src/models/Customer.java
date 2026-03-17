package models;

public class Customer extends User {

    public Customer(String name) {
        super(name);
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Customer");
    }
}