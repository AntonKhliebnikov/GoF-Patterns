package gof.creational.builder;

public class CargoTransportationBuilder implements TransportationBuilder {
    private String route;
    private String vehicle;
    private int price;


    @Override
    public void setRout(String route) {
        this.route = route;
    }

    @Override
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public CargoTransportation getTransportation() {
        return new CargoTransportation(route, vehicle, price);
    }
}
