package hilleldz.dz7;

//Напишите программу, в которой с помощью System.out.println выводятся все числа
//от 1 до 100 с двумя исключениями.

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz ");
            } else
                System.out.println(i + " ");

        }


    }
}
