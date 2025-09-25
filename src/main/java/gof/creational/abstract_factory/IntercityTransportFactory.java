package gof.creational.abstract_factory;

public class IntercityTransportFactory implements TransportFactory{

    @Override
    public PassengerTransport createPassengerTransport() {
        return new Bus();
    }

    @Override
    public CargoTransport createCargoTransport() {
        return new Truck();
    }
}