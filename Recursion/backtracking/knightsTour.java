import java.util.*;

public class knightsTour {

    static int[][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};

    public static void printKnightTours(int[][] chess, int r, int c, int upcomingMove){
        int n = chess.length;
        if(r >= n || c >= n || r < 0 || c < 0 || chess[r][c] > 0){
            return;
        }
        //if count == 5 * 5 i.e 25
        if(upcomingMove == n * n){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        //upcominMove is like a count
        chess[r][c] = upcomingMove;
        for(int d = 0; d < dir.length; d++){
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            printKnightTours(chess, x, y, upcomingMove + 1); 
        }

        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] chess = new int[n][n];
        printKnightTours(chess, r, c, 1);
    }
}
