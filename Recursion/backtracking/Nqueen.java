import java.util.*;

public class Nqueen {

    public static boolean isSafe(int r, int c, int[][] chess){
        int n = chess.length;
        //1. diagnol - prev row and next col
        for(int i =  r- 1, j = c + 1; i >= 0 && j < n; i--, j++){
            if(chess[i][j] == 1)
                return false;
        }

        //2. same col prev row
        for(int i =  r- 1, j = c ; i >= 0; i--){
            if(chess[i][j] == 1)
                return false;
        }

        //3.Diagnol - prev row and prev col
        for(int i =  r- 1, j = c - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1)
                return false;
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String asf, int row){
        if(row == chess.length){
            System.out.println(asf + ". ");
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isSafe(row, col, chess)){
                chess[row][col] = 1;
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
        printNQueens(chess, " ", 0);
    }
}
