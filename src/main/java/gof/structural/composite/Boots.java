package gof.structural.composite;

public class Boots implements Product {

    @Override
    public void getPrice() {
        System.out.println("La Sportiva, 400 $");
    }
}