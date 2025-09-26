package gof.creational.builder;

public class Director {
    public void buildPassengerTransportation(TransportationBuilder builder) {
        builder.setRout("Поездка от дома на работу");
        builder.setVehicle("Седан");
        builder.setPrice(300);
    }

    public void buildCargoTransportation(TransportationBuilder builder) {
        builder.setRout("Доставка со склада в магазин");
        builder.setVehicle("Грузовик");
        builder.setPrice(1000);
    }
}
