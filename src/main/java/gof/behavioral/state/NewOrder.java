package gof.behavioral.state;

public class NewOrder implements OrderState {
    private final Order order;

    public NewOrder(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Оплата получена!");
        order.setState(new PaidOrder(order));
    }

    @Override
    public void send() {
        System.out.println("Нельзя отправлять не оплаченный заказ...");
    }

    @Override
    public void deliver() {
        System.out.println("Доставка невозможна: заказ не отправлен...");
    }
}