package gof.creational.abstract_factory;

public class Trail implements CargoTransport {
    @Override
    public void deliver() {
        System.out.println("Доставка поездом");
    }
}
