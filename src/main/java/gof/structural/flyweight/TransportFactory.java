package gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TransportFactory {
    private static final Map<String, TransportType> transportTypeMap = new HashMap<>();

    public static TransportType getTransportType(String transportType) {
        TransportType result = transportTypeMap.get(transportType);
        if (result == null) {
            switch (transportType) {
                case "Passenger":
                    System.out.println("Пассажирская перевозка");
                    result = new TransportType(transportType);
                    break;
                case "Cargo":
                    System.out.println("Грузовая перевозка");
                    result = new TransportType(transportType);
            }
            transportTypeMap.put(transportType, result);
        }
        return result;
    }
}