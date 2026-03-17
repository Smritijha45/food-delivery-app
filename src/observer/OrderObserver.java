package observer;

public class OrderObserver implements Observer {

    private String userName;

    public OrderObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String status) {
        System.out.println(userName + " notified: Order is " + status);
    }
}