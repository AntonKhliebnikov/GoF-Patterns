package gof.behavioral.iterator;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        ShoesCollection sneakers = new SneakersCollection(List.of(
                new Shoes("Nike", "Sneakers"),
                new Shoes("Puma", "Sneakers"),
                new Shoes("Adidas", "Sneakers")
        ));

        ShoesCollection boots = new BootsCollection(List.of(
                new Shoes("La Sportiva", "Boots"),
                new Shoes("Timberland", "Boots")
        ));

        printCollection(sneakers.iterator());
        printCollection(boots.iterator());

    }

    private static void printCollection(ShoesIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}