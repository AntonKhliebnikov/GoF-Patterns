package gof.behavioral.state;

public class SentOrder implements OrderState {
    private final Order order;

    public SentOrder(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Заказ уже оплачен!");
    }

    @Override
    public void send() {
        System.out.println("Заказ отправлен!");
    }

    @Override
    public void deliver() {
        System.out.println("Заказ доставлен!");
        order.setState(new DeliveredOrder(order));
    }
}