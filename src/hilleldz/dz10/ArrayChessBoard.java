package hilleldz.dz10;


public class ArrayChessBoard {
    public static void main(String[] args) {
        int[][] array = new int[6][9];
        array = fillTwoDArray(array, -99, 99);
        printArray(array);
        System.out.println("Максимальное значение в массиве: " + findMax(array));


    }

    public static int[][] fillTwoDArray(int[][] array, int low, int high) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = low + (int) (Math.random() * ((high - low) + 1));
            }
        }
        return array;
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

    public static int findMax(int[][] array) {
        int maxElt = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElt)
                    maxElt = array[i][j];
            }
        }
        return maxElt;
    }
}
