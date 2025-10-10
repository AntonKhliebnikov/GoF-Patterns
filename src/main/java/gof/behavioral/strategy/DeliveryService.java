package gof.behavioral.strategy;

public class DeliveryService {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliver() {
        strategy.deliver();
    }
}