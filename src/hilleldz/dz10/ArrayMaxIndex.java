package hilleldz.dz10;


import java.util.Arrays;
import java.util.Random;

public class ArrayMaxIndex {
    public static void main(String[] args) {
        int[][] array = fillTwoDArray(new int[7][5], -5, 5);
        System.out.println("Индекс строки с наибольшим по модулю произведением элементов: " + maxRow(array));
    }

    public static int[][] fillTwoDArray(int[][] array, int low, int high) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = low + random.nextInt(high - low + 1);
            }
        }
        return array;
    }

    public static int maxRow(int[][] array) {
        int maxProduct = 0;
        int product = 1;
        int index = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                product *= array[i][j];
            }
            if (Math.abs(product) > maxProduct) {
                maxProduct = Math.abs(product);
            }
            product = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                product *= array[i][j];
            }
                if (Math.abs(product) == maxProduct && counter < 2) {
                    counter++;
                    index = i;
                }
                product = 1;
            }
        return index;
    }
}
