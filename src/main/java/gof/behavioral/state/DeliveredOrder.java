package gof.behavioral.state;

public class DeliveredOrder implements OrderState {

    public DeliveredOrder(Order order) {
    }

    @Override
    public void pay() {
        System.out.println("Заказ завершен!");
    }

    @Override
    public void send() {
        System.out.println("Заказ завершен!");
    }

    @Override
    public void deliver() {
        System.out.println("Заказ завершен!");
    }
}