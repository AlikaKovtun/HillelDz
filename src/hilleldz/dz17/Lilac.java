package hilleldz.dz17;

public class Lilac extends Flower{

    public Lilac() {
        super(27);
    }

    @Override
    public String toString() {
        return "Сирень"  + "(" + super.getPrice() + ")";
    }
}
