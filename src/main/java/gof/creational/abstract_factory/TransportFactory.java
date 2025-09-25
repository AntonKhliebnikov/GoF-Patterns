package gof.creational.abstract_factory;

public interface TransportFactory {
    PassengerTransport createPassengerTransport();
    CargoTransport createCargoTransport();
}
