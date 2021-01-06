package hilleldz.dz17;

public class Tulip extends Flower {

    public Tulip() {
        super(20);
    }

    @Override
    public String toString() {
        return "Тюльпан"  + "(" + super.getPrice() + ")";
    }
}
