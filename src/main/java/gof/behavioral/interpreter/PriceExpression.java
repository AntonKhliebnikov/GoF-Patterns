package gof.behavioral.interpreter;

public class PriceExpression implements Expression{
    private final int price;

    public PriceExpression(int price) {
        this.price = price;
    }

    @Override
    public boolean interpret(Sneakers context) {
        return context.getPrice() < price;
    }
}