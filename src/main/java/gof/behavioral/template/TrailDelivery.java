package gof.behavioral.template;

public class TrailDelivery extends DeliveryService {
    @Override
    protected void setTransport() {
        System.out.println("Перевозка поездом.");
    }
}
