package gof.behavioral.iterator;

import java.util.List;

public class BootsIterator implements ShoesIterator{
    private List<Shoes> boots;
    private int index = 0;

    public BootsIterator(List<Shoes> boots) {
        this.boots = boots;
    }

    @Override
    public boolean hasNext() {
        return index < boots.size();
    }

    @Override
    public Shoes next() {
        return boots.get(index++);
    }
}