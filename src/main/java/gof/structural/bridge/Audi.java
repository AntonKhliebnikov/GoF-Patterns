package gof.structural.bridge;

public class Audi extends CarRental {

    public Audi(ColorSelection colorSelection) {
        super(colorSelection);
    }

    @Override
    public void rental() {
        System.out.println("Аренда Audi");
        colorSelection.setColor();
    }
}
