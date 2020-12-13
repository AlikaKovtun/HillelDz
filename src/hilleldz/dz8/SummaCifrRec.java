package hilleldz.dz8;

import java.util.Scanner;

public class SummaCifrRec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.println("Сумма цифр в числе равна: " + sumDigits(number));

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) return number % 10;
        sum = number % 10 + sumDigits(number / 10);
        return sum;
    }
}
