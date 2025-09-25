package gof.creational.abstract_factory;

public class CityTransportFactory implements TransportFactory{
    @Override
    public PassengerTransport createPassengerTransport() {
        return new Taxi();
    }

    @Override
    public CargoTransport createCargoTransport() {
        return new Truck();
    }
}
