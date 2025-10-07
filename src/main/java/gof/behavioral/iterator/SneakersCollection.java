package gof.behavioral.iterator;

import java.util.List;

public class SneakersCollection implements ShoesCollection{
    private List<Shoes> sneakers;

    public SneakersCollection(List<Shoes> sneakers) {
        this.sneakers = sneakers;
    }

    @Override
    public ShoesIterator iterator() {
        return new SneakersIterator(sneakers);
    }
}
