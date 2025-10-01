package gof.structural.bridge;

public class Client {
    public static void main(String[] args) {
        ColorSelection colorSelection = new Black();
        CarRental rental = new Audi(colorSelection);
        rental.rental();
    }
}
