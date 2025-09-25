package gof.creational.abstract_factory;

public class Taxi implements PassengerTransport {
    @Override
    public void ride() {
        System.out.println("Поездка на такси");
    }
}
