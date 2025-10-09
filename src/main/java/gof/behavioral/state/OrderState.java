package gof.behavioral.state;

public interface OrderState {
    void pay();

    void send();

    void deliver();
}