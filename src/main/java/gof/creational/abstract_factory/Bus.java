package gof.creational.abstract_factory;

public class Bus implements PassengerTransport{
    @Override
    public void ride() {
        System.out.println("Поездка на автобусе");
    }
}
