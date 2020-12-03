package hilleldz.dz6;

import java.util.Scanner;

public class MainBMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Как Вас зовут? ");
        String name = scan.nextLine();
        System.out.print("Какой у Вас рост? ");
        double height = scan.nextDouble();
        if (height > 3) {
            height /= 100;
        }
        System.out.print("Какой у Вас вес? ");
        double weight = scan.nextDouble();

        double bmi = BodyMassIndex.calculateBodyMassIndex(weight, height);
        //Это вывод из части 1 пункт 7. Комментирую его потомучто при запуске
        //выводится и он и sout из 3 части.
        //System.out.printf(name + ", Ваш индекс массы тела составляет: %.2f", bmi);
        //System.out.printf(" кг/м" + (char)178);
        //Если необходимо вывести просто результат работы метода в виде одного числа:
        //System.out.println(BodyMassIndex.calculateBodyMassIndex(weight, height));

        BodyMassIndex.printResult(name, weight, height, bmi);


    }
}
