package gof.behavioral.template;

public abstract class DeliveryService {
    public final void deliver(){
        setTransport();
        calculateRoute();
        calculateCost();
    }

    protected abstract void setTransport();

    void calculateRoute() {
        System.out.println("Маршрут рассчитан.");
    }

    void calculateCost() {
        System.out.println("Стоимость рассчитана.");
    }
}
