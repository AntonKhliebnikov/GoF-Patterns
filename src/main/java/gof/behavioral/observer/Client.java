package gof.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        SneakersShop sneakers = new SneakersShop("Nike", 5000);
        SneakersSubscriber anton = new PriceSubscriber("Антон");
        SneakersSubscriber masha = new PriceSubscriber("Маша");
        SneakersSubscriber kostya = new PriceSubscriber("Костя");

        sneakers.addSubscriber(anton);
        sneakers.addSubscriber(masha);
        sneakers.addSubscriber(kostya);

        sneakers.notifySubscriber(6000);

    }
}
