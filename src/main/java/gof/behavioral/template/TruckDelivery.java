package gof.behavioral.template;

public class TruckDelivery extends DeliveryService {
    @Override
    protected void setTransport() {
        System.out.println("Перевозка грузовиком.");
    }
}
