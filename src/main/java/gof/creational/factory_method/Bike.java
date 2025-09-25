package gof.creational.factory_method;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Быстрая доставка");
    }
}
