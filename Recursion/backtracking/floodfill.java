import java.util.*;

public class floodfill {

    public static void ff(int[][] maze, int sr, int sc, String asf, boolean[][] vis){
        if(sr >= maze.length || sc >= maze[0].length || sr < 0 || sc < 0 || maze[sr][sc] == 1 || vis[sr][sc] == true){
            return;
        }

        if(sr == maze.length - 1 && sc == maze[0].length - 1){
            System.out.println(asf);
            return;
        }

        vis[sr][sc] = true;
        ff(maze, sr - 1, sc, asf + "t", vis);
        ff(maze, sr, sc - 1, asf + "l", vis);
        ff(maze, sr + 1, sc, asf + "d", vis);
        ff(maze, sr, sc + 1, asf + "r", vis);
        vis[sr][sc] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean [][] vis = new boolean[n][m];

        ff(arr,0,0,"", vis);
    }
}
