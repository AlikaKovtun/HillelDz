package hilleldz.dz10;

import java.util.Random;

public class ArrayMinElement {
    public static void main(String[] args) {
        int[][] array = fillTwoDArray(new int[3][5], 0, 9);
        minSort(array);
        maxSort(array);
        printArray(array);

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

    //Если необходимо переставить наименьший элемент в начало (поменять с первым),
// наибольший в конец (поменять с последним), а остальные не трогать, то решение такое:
    public static void minSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int minElt = array[i][0];
            int indFirst = i;
            int indSecond = 0;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < minElt) {
                    minElt = array[i][j];
                    indFirst = i;
                    indSecond = j;
                }
            }
            int tmp = array[i][0];
            array[i][0] = minElt;
            array[indFirst][indSecond] = tmp;
        }
    }

    public static void maxSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int maxElt = array[i][0];
            int indFirst = i;
            int indSecond = 0;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxElt) {
                    maxElt = array[i][j];
                    indFirst = i;
                    indSecond = j;
                }
            }
            int tmp = array[i][array[i].length - 1];
            array[i][array[i].length - 1] = maxElt;
            array[indFirst][indSecond] = tmp;
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0)
                    System.out.print(array[i][j] + " ");
                else
                    System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }

//Если нужно отсортировать каждую строку от минимального к максимальному значению, то такое:
    /*public static void arrayTwoDSort(int[][] array) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length-1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = tmp;
                        b = true;
                    }
                }
            }
        }
    } */
}
