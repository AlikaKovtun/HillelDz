package hilleldz.dz16;

public enum Drinks {
    YES(0, "Алкогольный напиток", 10),
    NO(1, "Безалкогольный напиток", 3);

    private final int var;
    private final String description;
    private final int price;

    Drinks(int var, String description, int price) {
        this.var = var;
        this.description = description;
        this.price = price;
    }

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "var=" + var +
                ", description='" + description + '\'' +
                ", price=" + price + "$" +
                '}';
    }
}
