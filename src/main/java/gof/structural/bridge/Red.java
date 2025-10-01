package gof.structural.bridge;

public class Red implements ColorSelection {
    @Override
    public void setColor() {
        System.out.println("Красный цвет");
    }
}
