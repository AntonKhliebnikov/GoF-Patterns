package gof.behavioral.observer;

public class PriceSubscriber implements SneakersSubscriber {
    private final String name;

    public PriceSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(SneakersShop sneakers) {
        System.out.println(name + ", актуальная цена на кроссовки " + sneakers.getModel()
                + ": " + sneakers.getPrice());
    }
}