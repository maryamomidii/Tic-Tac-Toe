package tictactoe;

public class winner 
{
    private char[][] board = new char[3][3];

    public winner(char[][] board){
        this.board = board;
    }
    
    public boolean checkwinner()
    {
        //check the rows
        for ( int i = 0 ; i < 3 ; i++){
            if (board[i][0] ==board[i][1]  && board[i][1]== board[i][2] && board[i][1] != ' '){
                if (board[i][0] == 'X'){
                    System.out.println("PLAYER1 \"X\" WON!!");
                    return true;}

            else if (board[i][0] == 'O'){
                System.out.println("PLAYER2 \"O\" WON!!");
                return true;}
            }
        }

        //check the columns
        for ( int i = 0 ; i < 3 ; i++){
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != ' '){
                if (board[0][i] == 'X'){
                    System.out.println("PLAYER1 \"X\" WON!!");
                    return true;
                }

                else if (board[0][i] == 'O'){
                    System.out.println("PLAYER2 \"O\" WON!!");
                    return true;
                }
            }
        }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ' )
        {
            if (board[0][0] == 'X'){
                System.out.println("PLAYER1 \"X\" WON!!");
                return true;
            }

            else if (board[0][0] == 'O'){
                System.out.println("PLAYER2 \"O\" WON!!");
                return true;
            }
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != ' ')
        {
            if (board[0][0] == 'X'){
                System.out.println("PLAYER1 \"X\" WON!!");
                return true;
            }
            

            else if (board[0][0] == 'O'){
                System.out.println("PLAYER2 \"O\" WON!!");
                return true;
            }
        }
        return false;
    }

    public boolean checkdraw() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board[x][y] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("It's a draw! Well done!");
        return !checkwinner();
    }
}
    
