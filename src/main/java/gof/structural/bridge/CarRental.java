package gof.structural.bridge;

public abstract class CarRental {
    protected ColorSelection colorSelection;

    public CarRental(ColorSelection colorSelection) {
        this.colorSelection = colorSelection;
    }

    public abstract void rental();
}
