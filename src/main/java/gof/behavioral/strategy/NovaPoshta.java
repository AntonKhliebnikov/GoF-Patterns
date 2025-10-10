package gof.behavioral.strategy;

public class NovaPoshta implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставка осуществляется в отделение Новой Почты.");
    }
}