package gof.creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        TransportFactory transportFactory = new IntercityTransportFactory();

        PassengerTransport transport = transportFactory.createPassengerTransport();
        transport.ride();

        CargoTransport cargoTransport = transportFactory.createCargoTransport();
        cargoTransport.deliver();
    }
}
