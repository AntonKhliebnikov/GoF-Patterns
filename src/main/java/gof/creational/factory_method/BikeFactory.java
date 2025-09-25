package gof.creational.factory_method;

public class BikeFactory extends TransportFactory {
    @Override
    protected Transport createTransport() {
        return new Bike();
    }
}
