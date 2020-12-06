package hilleldz.dz7;

import java.util.Scanner;

//Напишите программу, которая отображает таблицу умножения для заданного числа.
//В примере вывода для числа 5, последний второй множитель тоже равне 5. Я пишу первый вариант классичекой таблицы от 0 до 10
//и второй вариант ниже, до второго множителя равного первому

public class TablicaUmnozh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        /*
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
         */
    }
}
