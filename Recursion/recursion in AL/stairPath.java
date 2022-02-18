import java.util.*;

public class stairPath {

    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        
        for(int i = 1; i<=3; i++){
            if(n-i >= 0){
                ArrayList<String> rec = getStairPath( n - i);
                for(String ele :rec){
                    myAns.add(i+ele);
                }
            }
        }
        return myAns;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPath(n);
        System.out.println(ans);
    }
}
