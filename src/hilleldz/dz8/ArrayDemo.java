package hilleldz.dz8;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] ar = {2, 6, 4, 0, -5, 8};
        System.out.println("Сумма элементов массива: " + sum(ar));
        System.out.println("Среднее арифметическое элементов массива: " + sredneeArifm(ar));
        System.out.println("Максимальный элемент в массиве: " + maxElmnt(ar));

        System.out.println("До метода increaseAr: ");
        printAr(ar);
        System.out.println();
        System.out.println("Длина массива: " + ar.length);

        System.out.println("После метода increaseAr: ");
        int[] arNew = increaseAr(ar, 5);
        printAr(arNew);
        System.out.println();
        System.out.println("Длина массива: " + arNew.length);

        reverse(ar);
        System.out.print("Перевернутый массив: ");
        printAr(ar);
    }

    public static int sum(int[] ar) {
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum;
    }

    public static double sredneeArifm(int[] ar) {
        return (double) sum(ar) / ar.length;
    }

    public static int maxElmnt(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) max = ar[i];
        }
        return max;
    }

    public static int[] increaseAr(int[] ar, int number) {
        int[] ar2 = new int[number + ar.length];
        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar[i];
        }
        return ar2;
    }

    public static void reverse(int[] ar) {
        int tmp;
        for (int i = 0; i < ar.length / 2; i++) {
            tmp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = tmp;
        }
    }

    public static void printAr(int[] ar) {
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }


}
