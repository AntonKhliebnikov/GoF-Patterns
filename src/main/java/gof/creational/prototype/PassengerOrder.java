package gof.creational.prototype;

public class PassengerOrder implements TransportationOrder {
    private String route;
    private String vehicle;
    private int price;
    private String serviceClass;

    public PassengerOrder(String route, String vehicle, int price, String serviceClass) {
        this.route = route;
        this.vehicle = vehicle;
        this.price = price;
        this.serviceClass = serviceClass;
    }

    @Override
    public TransportationOrder clone() {
        return new PassengerOrder(this.route, this.vehicle, this.price, this.serviceClass);
    }

    @Override
    public void setRoute(String route) {
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

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    @Override
    public String toString() {
        return "PassengerOrder{" +
                "route='" + route + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", price=" + price +
                ", serviceClass='" + serviceClass + '\'' +
                '}';
    }
}
