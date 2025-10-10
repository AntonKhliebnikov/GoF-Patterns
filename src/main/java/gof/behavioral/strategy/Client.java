package gof.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        DeliveryStrategy strategyNP = new NovaPoshta();
        service.setStrategy(strategyNP);
        service.deliver();

        DeliveryStrategy strategyCourier = new Courier();
        service.setStrategy(strategyCourier);
        service.deliver();
    }
}