package gof.behavioral.interpreter;

public class Sneakers {
    private final String brand;
    private final int price;

    public Sneakers(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}