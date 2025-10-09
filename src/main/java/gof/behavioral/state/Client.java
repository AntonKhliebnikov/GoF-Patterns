package gof.behavioral.state;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        order.pay();
        order.pay();
        order.deliver();
        order.send();
        order.deliver();
        order.send();
    }
}