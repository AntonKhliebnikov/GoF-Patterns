package gof.creational.prototype;

public interface TransportationOrder {
    TransportationOrder clone();
    void setRoute(String route);
    void setVehicle(String vehicle);
    void setPrice(int price);
}
