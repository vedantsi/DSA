import java.util.Scanner;
public class TicTacToe {
    //Globally declaring variables
    private char[][] board;
    private char currentPlayer;
    private Scanner sc;

    //Constructor initialize
    public TicTacToe()
    {
        board=new char[3][3];
        currentPlayer='X';
        sc=new Scanner(System.in);
        initializeBoard();        
    }
    public void start()
    {
        boolean gameEnded=false;
        while(!gameEnded)
        {
            printBoard();
            playerMove();
            gameEnded=checkWinner();
            if(!gameEnded)
            {
                switchPlayer();
            }
        }
        printBoard();
    }
    private void initializeBoard() {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                board[i][j]='-';
            }
        }
    }
    private void printBoard() {
        System.out.println("Board:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    private void playerMove() {
        int row=-1;
        int col=-1;
        //Writing edge cases for out of bound
        while(row<0 || col<0 || row >=3 || col>=3 || board[row][col]!='-')
        {
            System.out.println("Player"+" "+currentPlayer +" "+"enter your move(row and column)");
            row=sc.nextInt();
            col=sc.nextInt();

        }
        board[row][col]=currentPlayer;
    }
    private boolean checkWinner() {
        //check row, columns and diagonals for a win
        for(int i=0; i<3; i++)
        {
            if(board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer)
            {
                System.out.println("Player"+currentPlayer +"Wins!");
                return true;
            }
            if(board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer)
            {
                System.out.println("Player"+currentPlayer +"Wins!");
                return true;
            }

        }
        if(board[0][0]==currentPlayer && board[1][1]==currentPlayer && board[2][2]==currentPlayer)
        {
            System.out.println("Player"+currentPlayer +"Wins!");
            return true;
        }
        if(board[2][0]==currentPlayer && board[1][1]==currentPlayer && board[0][2]==currentPlayer)
        {
            System.out.println("Player"+currentPlayer+"Wins!");
            return true;
        }
        //check for a tie
        boolean tie=true;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(board[i][j]=='-')
                {
                    tie=false;
                }
            }
        }
        if(tie)
        {
            System.out.println("The game is a Tie");
            return true;
        }
        return false;

    }
    private void switchPlayer() {
        currentPlayer=(currentPlayer=='X')?'0':'X';
    }
    

    

}
