package gof.behavioral.strategy;

public class Courier implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставка осуществляется курьером.");
    }
}