package hilleldz.dz16;

public enum Menu {
    SOUP(0, "Минестроне", 5),
    VEGETABLES(1, "Овощное рагу", 7),
    MEAT(2, "Стейк", 14),
    DESSERT(3, "Тирамису", 6);

    private final int var;
    private final String description;
    private final int price;

    Menu(int var, String description, int price) {
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
        return "Menu{" +
                "var=" + var +
                ", description='" + description + '\'' +
                ", price=" + price + "$" +
                '}';
    }
}
