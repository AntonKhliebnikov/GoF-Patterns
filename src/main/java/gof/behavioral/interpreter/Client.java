package gof.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        Expression nike = new BrandExpression("Nike");
        Expression puma = new BrandExpression("Puma");
        Expression priceLimit = new PriceExpression(1000);

        Expression brandFilter = new OrExpression(nike, puma);
        Expression priceFilter = new AndExpression(priceLimit, brandFilter);

        Sneakers context = new Sneakers("Nike", 900);
        boolean result = priceFilter.interpret(context);
        System.out.println(result);
    }
}