package gof.structural.bridge;

public class BMW extends CarRental {

    public BMW(ColorSelection colorSelection) {
        super(colorSelection);
    }

    @Override
    public void rental() {
        System.out.println("Аренда BMW");
        colorSelection.setColor();
    }
}
