package gof.creational.prototype;

public class Client {
    public static void main(String[] args) {
        TransportationOrder passengerOrder = new PassengerOrder("Поездка из Одессы в Киев", "Седан",
                2000, "Comfort");
        System.out.println(passengerOrder);

        TransportationOrder clonedPassengerOrder = passengerOrder.clone();
        clonedPassengerOrder.setVehicle("Минивэн");
        clonedPassengerOrder.setPrice(3000);
        System.out.println(clonedPassengerOrder);
    }
}
