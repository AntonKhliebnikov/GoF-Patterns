package gof.structural.flyweight;

public class Transport {
    private final String route;
    private final String vehicle;
    private final int price;
    private final TransportType transportType;

    public Transport(String rout, String vehicle, int price, TransportType transportType) {
        this.route = rout;
        this.vehicle = vehicle;
        this.price = price;
        this.transportType = transportType;
    }

    public void delivery() {
        System.out.println(transportType.delivery(" " + route + ", ", vehicle + ", ", price));
    }
}