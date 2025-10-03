package gof.structural.flyweight;

public class TransportType {

    private final String transportType;

    public TransportType(String transportType) {
        this.transportType = transportType;
    }

    public String delivery(String route, String vehicle, int price) {
        return transportType + route + vehicle + price;
    }
}