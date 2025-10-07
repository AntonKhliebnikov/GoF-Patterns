package gof.behavioral.interpreter;

public class BrandExpression implements Expression{
    private final String brand;

    public BrandExpression(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean interpret(Sneakers context) {
        return context.getBrand().equals(brand);
    }
}