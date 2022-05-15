import java.util.*;

public class digitFrequency {
    public static int getDigitFrequency(int n, int d){
        int occ = 0;
        while(n != 0){
            int ld = n % 10;
            n /= 10;
            if(ld == d)
                occ++;
        }
        return occ;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int ans = getDigitFrequency(n, d);
            System.out.println(ans);
        }
    }
    
}