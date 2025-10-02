package gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Shoes implements Product {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void getPrice() {
        System.out.println("Цена товаров:");
        for (Product product : products) {
            product.getPrice();
        }
    }
}
