package gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SneakersShop {
    private String model;
    private int price;
    private final List<SneakersSubscriber> subscribers = new ArrayList<>();

    public SneakersShop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void addSubscriber(SneakersSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(SneakersSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(int newPrice) {
        if (price != newPrice) {
            this.setPrice(newPrice);
            for (SneakersSubscriber subscriber : subscribers) {
                subscriber.update(this);
            }
        }
    }
}