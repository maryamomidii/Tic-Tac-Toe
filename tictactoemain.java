package tictactoe;
import java.util.Scanner;
import tictactoe.winner;

public class tictactoemain{


    private static void drawboard(char[][] board1) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board1[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    public static void main(String[] args) {
        
        char[][] board = new char[3][3];
        winner Winner = new winner(board);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
            board[i][j] = ' ';
            }
        }

        System.out.println("player1 \"X\" vs player2 \"O\"");
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        ///game:
        while (!Winner.checkwinner() && !Winner.checkdraw()) {
            if (i % 2 != 0){
                System.out.println("Player " + 1 +" turns: ");
            }
            else{
                System.out.println("Player " + 2 +" turns: ");}
            System.out.print("Enter the row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter the column (0-2): ");
            int column = scanner.nextInt();
        
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Invalid row or column. Try again!!");
                continue;
            }
        
           if (board[row][column] != ' ') {
                System.out.println("Invalid move. Try again!!");
                continue;
            }
            if (i % 2 == 0){
                board[row][column] = 'O';
                drawboard(board);
            }
        
            else{
                board[row][column] = 'X';
                drawboard(board);
            }
            i+=1;    
        }
        scanner.close();
    }
}

