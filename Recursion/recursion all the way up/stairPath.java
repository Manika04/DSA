import java.util.*;

public class stairPath {

    // public static void printStairPath(int n, String path){
    //     if(n <= 0){
    //         if(n == 0){
    //             System.out.println(path);
    //         }
    //         return;
    //     }

    //     printStairPath(n - 1, path + 1);
    //     printStairPath(n - 2, path + 2);
    //     printStairPath(n - 3, path + 3);
    // }

    public static void printStairPath(int n, String path){
            if(n == 0){
                System.out.println(path);
                return;
            }

        for(int step = 1; step <= 3; step++){
            if(n - step >= 0){
                printStairPath(n - step , path + step);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPath(n, "");
    }
}
