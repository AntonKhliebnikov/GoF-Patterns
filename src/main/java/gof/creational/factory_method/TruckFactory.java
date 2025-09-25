package gof.creational.factory_method;

public class TruckFactory extends TransportFactory {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
