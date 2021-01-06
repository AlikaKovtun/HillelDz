package hilleldz.dz17;

public class Carnation extends Flower{

    public Carnation() {
        super(10);
    }

    @Override
    public String toString() {
        return "Гвоздика"  + "(" + super.getPrice() + ")";
    }
}
