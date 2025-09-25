package gof.creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        TransportFactory factory1 = new IntercityTransportFactory();

        PassengerTransport transport1 = factory1.createPassengerTransport();
        transport1.ride();

        CargoTransport transport2 = factory1.createCargoTransport();
        transport2.deliver();

        TransportFactory factory2 = new CityTransportFactory();

        PassengerTransport transport3 = factory2.createPassengerTransport();
        transport3.ride();

        CargoTransport transport4 = factory2.createCargoTransport();
        transport4.deliver();
    }
}