package gof.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        TransportType passengerType = TransportFactory.getTransportType("Passenger");
        TransportType cargoType = TransportFactory.getTransportType("Cargo");

        List<Transport> transports = new ArrayList<>();

        transports.add(new Transport("Из Одесы в Киев", "Автобус", 1500, passengerType));
        transports.add(new Transport("Из Одессы в Винницу", "Седан", 1000, passengerType));
        transports.add(new Transport("Из Харькова в Винницу", "Фура", 10000, cargoType));
        transports.add(new Transport("Из Одессы в Харьков", "Фура", 10000, cargoType));
        transports.add(new Transport("Из Днепра в Винницу", "Седан", 1000, passengerType));
        transports.add(new Transport("Из Днепра в Николаев", "Грузовик", 5000, cargoType));

        for (Transport transport: transports) {
            transport.delivery();
        }
    }
}