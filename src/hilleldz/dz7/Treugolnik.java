package hilleldz.dz7;

//Напишите программу, которая отображает прямоугольный треугольник с числами.

import java.util.Scanner;

public class Treugolnik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
