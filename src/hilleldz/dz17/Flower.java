package hilleldz.dz17;

public abstract class Flower {

    private final String name;
    private double price;

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "(" + price + ")";
    }
}
