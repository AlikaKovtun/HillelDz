package hilleldz.dz7;

import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сторону шахматной доски: ");
        int storona = scan.nextInt();
        StringBuilder chessBoard = new StringBuilder();

        for (int i = 1; i <= storona; i += 1) {
            if (i % 2 != 0) {
                for (int j = 1; j <= storona; j += 1) {
                    chessBoard.append("#");
                    chessBoard.append(" ");
                }
            } else {
                for (int j = 1; j < storona; j += 1) {
                    chessBoard.append(" ");
                    chessBoard.append("#");
                }

            }
            chessBoard.append("\n");
        }
        System.out.println(chessBoard);

    }
}

