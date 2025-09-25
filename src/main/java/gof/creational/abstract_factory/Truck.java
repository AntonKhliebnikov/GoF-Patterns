package gof.creational.abstract_factory;

public class Truck implements CargoTransport {
    @Override
    public void deliver() {
        System.out.println("Доставка грузовиком");
    }
}
