package hilleldz.dz7;

import java.util.Scanner;

//Напишите программу для подсчета всех слов в строке.

public class PodshetSlovVStroke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку из Вашей любимой песни: ");
        String stroka = scan.nextLine();
        System.out.println("В Вашей любимой строке " + podschetSlov(stroka) + " слов");

    }

    public static int podschetSlov(String s) {
        String[] words = s.split(" ");
        return words.length;
    }

}
