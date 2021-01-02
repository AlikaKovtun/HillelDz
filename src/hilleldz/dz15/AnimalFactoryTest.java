package hilleldz.dz15;

import java.util.Scanner;

public class AnimalFactoryTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение: ");
        String animalStr = scan.nextLine();

        while (true) {
            if (AnimalFactory.getAnimalByKey(animalStr) == null) {
                System.out.println("Не могу создать Animal");
                System.out.print("Введите значение: ");
                animalStr = scan.nextLine();
            } else {
                Animal animal = AnimalFactory.getAnimalByKey(animalStr);
                System.out.println(animal.getName());
                return;
            }
        }
    }
}