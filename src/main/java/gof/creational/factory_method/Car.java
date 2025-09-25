package gof.creational.factory_method;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Перевозка людей");
    }
}
