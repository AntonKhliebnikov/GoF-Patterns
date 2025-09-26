package gof.creational.factory_method;

public class CarFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
