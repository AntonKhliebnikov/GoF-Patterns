package gof.creational.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        PassengerTransportationBuilder passengerTransportationBuilder = new PassengerTransportationBuilder();
        director.buildPassengerTransportation(passengerTransportationBuilder);
        PassengerTransportation passengerTransportation = passengerTransportationBuilder.getTransportation();
        System.out.println(passengerTransportation);

        CargoTransportationBuilder cargoTransportationBuilder = new CargoTransportationBuilder();
        director.buildCargoTransportation(cargoTransportationBuilder);
        CargoTransportation cargoTransportation = cargoTransportationBuilder.getTransportation();
        System.out.println(cargoTransportation);
    }
}
