package gof.behavioral.state;

public class PaidOrder implements OrderState {
    private final Order order;

    public PaidOrder(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Заказ уже оплачен!");
    }

    @Override
    public void send() {
        System.out.println("Заказ отправлен!");
        order.setState(new SentOrder(order));
    }

    @Override
    public void deliver() {
        System.out.println("Заказ еще доставляется...");
    }
}