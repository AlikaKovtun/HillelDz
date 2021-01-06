package hilleldz.dz17;

import java.util.Scanner;

public class CollectBouquet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Введите желаемое количество цветов в букете: ");
            number = scan.nextInt();
            if (number <= 0) System.out.println("Некорректное значение!");
            else break;
        }

          makeBouquet(number);
    }

    public static Flower getRandomFlower() {

        int x = 1 + (int) (Math.random() * 4);

        switch (x) {
            case 1:
                return new Lilac();
            case 2:
                return new Carnation();
            case 3:
                return new Rose();
            default:
                return new Tulip();
        }
    }

    public static void makeBouquet(int number) {
        double cost = 0;
        System.out.println("Сформирован букет из " + number + " цветов:");
        for (int i = 1; i <= number; i++) {
            Flower flower = getRandomFlower();
            System.out.println("#" + i + " " + flower);
            cost += flower.getPrice();
        }
        System.out.println("Стоимость букета: " + cost);


    }
}
