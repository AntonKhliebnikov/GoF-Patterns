package gof.behavioral.iterator;

public class Shoes {
    private final String model;
    private final String type;

    public Shoes(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}