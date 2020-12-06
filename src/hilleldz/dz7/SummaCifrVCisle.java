package hilleldz.dz7;

import java.util.Scanner;

public class SummaCifrVCisle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.println("Сумма цифр в числе равна: " + sumDigits(number));

    }

    public static int sumDigits(int number) {
        if (number < 10) return -1;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

