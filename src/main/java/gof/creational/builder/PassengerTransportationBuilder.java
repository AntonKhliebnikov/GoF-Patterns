package gof.creational.builder;

public class PassengerTransportationBuilder implements TransportationBuilder {
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

    public PassengerTransportation getTransportation() {
        return new PassengerTransportation(route, vehicle, price);
    }
}
