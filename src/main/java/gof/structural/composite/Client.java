package gof.structural.composite;

public class Client {
    public static void main(String[] args) {
        Shoes shoes = new Shoes();

        Product sneakers = new Sneakers();
        Product boots = new Boots();

        sneakers.getPrice();

        shoes.addProduct(sneakers);
        shoes.addProduct(boots);

        shoes.getPrice();
    }
}
