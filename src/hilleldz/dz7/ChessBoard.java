package hilleldz.dz7;

import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сторону шахматной доски: ");
        int storona = scan.nextInt();
        StringBuilder chessBoard = new StringBuilder();

        for (int i = 1; i <= storona; i++) {
            for (int j = 1; j <= storona; j++) {
                chessBoard.append(printChessBoard(i, j));
            }
            chessBoard.append("\n");
        }
        System.out.println(chessBoard);

    }
    public static String printChessBoard(int row, int cell) {
        if ((row + cell) % 2 == 0) return "#";
        else return " ";
    }
}

