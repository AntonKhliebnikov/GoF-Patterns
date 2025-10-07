package gof.behavioral.iterator;

import java.util.List;

public class SneakersIterator implements ShoesIterator{
    private List<Shoes> sneakers;
    private int index = 0;

    public SneakersIterator(List<Shoes> sneakers) {
        this.sneakers = sneakers;
    }

    @Override
    public boolean hasNext() {
        return index < sneakers.size();
    }

    @Override
    public Shoes next() {
        return sneakers.get(index++);
    }
}