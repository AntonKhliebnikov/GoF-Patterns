package gof.creational.builder;

public class CargoTransportation {
    private final String route;
    private final String vehicle;
    private final int price;

    public CargoTransportation(String route, String vehicle, int price) {
        this.route = route;
        this.vehicle = vehicle;
        this.price = price;
    }

    public String getRoute() {
        return route;
    }

    public String getVehicle() {
        return vehicle;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CargoTransportation{" +
                "route='" + route + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", price=" + price +
                '}';
    }
}