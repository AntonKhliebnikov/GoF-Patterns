package gof.structural.bridge;

public class Black implements ColorSelection {
    @Override
    public void setColor() {
        System.out.println("Черный цвет");
    }
}
