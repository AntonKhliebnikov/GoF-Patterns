package gof.behavioral.iterator;

import java.util.List;

public class BootsCollection implements ShoesCollection{
    private List<Shoes> boots;

    public BootsCollection(List<Shoes> boots) {
        this.boots = boots;
    }

    @Override
    public ShoesIterator iterator() {
        return new BootsIterator(boots);
    }
}