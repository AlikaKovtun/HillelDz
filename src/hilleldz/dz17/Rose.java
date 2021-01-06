package hilleldz.dz17;

public class Rose extends  Flower{

    public Rose() {
        super(45);

    }

    @Override
    public String toString() {
        return "Роза" + "(" + super.getPrice() + ")";
    }
}
