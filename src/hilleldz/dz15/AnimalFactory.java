package hilleldz.dz15;

public class AnimalFactory {

    public static Animal getAnimalByKey(String key) {
        switch (key) {
            case "da":
                return new Dog("Арамис");
            case "db":
                return new Dog("Блек");
            case "dc":
                return new Dog("Спайки");
            case "ca":
                return new Cat("Амадей");
            case "cb":
                return new Cat("Баксик");
            case "cc":
                return new Cat("Снежок");
            default:
                return null;
        }
    }
}
