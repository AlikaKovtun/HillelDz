package hilleldz.dz17;

public abstract class Flower {

    private double price;

    public Flower(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
