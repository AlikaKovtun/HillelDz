package hilleldz.dz8;

import java.util.Scanner;

public class MaxSumArray {
    static final int START = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Число элементов в массиве: ");
        int numbElmnt = scan.nextInt();
        if (numbElmnt <= 0) {
            System.out.println("Некорректное значение!");
            return;
        }
        int[] ar = new int[numbElmnt];
        System.out.println("Введите " + numbElmnt + " элементов: ");
        for (int i = 0; i < numbElmnt; i++) {
            int elt = scan.nextInt();
            ar[i] = elt;
        }
        System.out.println("Максимальный элемент в массиве: " + maxElt(ar, START));
        System.out.println("Сумма элементов массива: " + sum(ar, START));
    }

    public static int maxElt(int ar[], int start) {
        if (start < ar.length - 1) {
            return Math.max(ar[start], maxElt(ar, start + 1));
        } else return ar[ar.length - 1];
    }

    public static int sum(int ar[], int start) {
        if(start == ar.length -1) {
            return ar[start];
        }
        return ar[start] + sum(ar, start +1 );
    }
}

