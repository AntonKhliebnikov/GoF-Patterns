package gof.creational.factory_method;

public class Client {
    public static void main(String[] args) {
        TransportFactory factory = new TruckFactory();
        Transport transport = factory.createTransport();
        transport.deliver();
    }
}
