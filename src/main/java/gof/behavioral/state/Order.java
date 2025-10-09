package gof.behavioral.state;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrder(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void pay() {
        state.pay();
    }

    public void send() {
        state.send();
    }

    public void deliver() {
        state.deliver();
    }
}