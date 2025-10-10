package gof.behavioral.template;

public class Client {
    public static void main(String[] args) {
        DeliveryService truckDelivery = new TruckDelivery();
        truckDelivery.deliver();

        DeliveryService trailDelivery = new TrailDelivery();
        trailDelivery.deliver();
    }

}
