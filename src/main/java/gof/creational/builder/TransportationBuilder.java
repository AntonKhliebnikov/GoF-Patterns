package gof.creational.builder;

public interface TransportationBuilder {
    void setRout(String route);
    void setVehicle(String vehicle);
    void setPrice(int price);
}
