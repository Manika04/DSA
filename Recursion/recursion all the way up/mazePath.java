import java.util.*;

public class mazePath {

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        if(sc + 1 <= dc){
            printMazePaths(sr, sc + 1, dr,dc, psf + "h");
        }
        if(sr + 1 <= dr){
            printMazePaths(sr + 1, sc, dr,dc, psf + "v");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
    }
}
