import java.util.Scanner;

public class pattern {
    public static void pattern0(int n) {
        //nsp = no. of spaces ; nst= no. of stars
        //csp = count of space ; cst = count of stars
        int nsp = n, nst = n;
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //relation between lines 
            nsp += 0;
            nst += 0;
            System.out.println();
        }
    }
    public static void pattern1(int n) {
        int nsp = 0, nst = 1; // this is written by observing 1st row.. hamesha 1st row dekhna hai yeh likhne ke liye
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //relation between lines 
            nst++;
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        int nsp = 0, nst = n;
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //relation between lines 
            nst--;
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        int nsp = n - 1, nst = 1;
        for(int r = 1; r <= n; r++){
            
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");

            for(int cst = 1; cst <= nst; cst ++)
            System.out.print("*\t");


            nsp--;
            nst++;
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        int nsp = 0, nst = n;
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //relation between lines 
            nsp++;
            nst--;
            System.out.println();
        }
    }
    //diamond = only for odd numbers because inc aur dec odd pattern mein ho raha hai
    public static void pattern5(int n) {
        int nsp = n/2, nst = 1;
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //relation between lines 
            if(r <= n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
    public static void pattern5_01(int n) {
        int nsp = n/2, nst = 1;
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
                int count = ( r<=n/2 +1) ? r : n - r +1;
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print(count + "\t");

            //relation between lines 
            if(r <= n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
    public static void pattern6(int n) {
        if(n%2 == 0)
            n++;// to convert into odd
        int nsp = 1, nst = (n+1)/2;
        for(int r = 1; r <= n; r++){
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print("*\t");

            //relation between lines 
            if(r <= n/2){
                nsp+=2;
                nst--;
            }else{
                nsp -=2;
                nst++;
            }
            System.out.println();
        }
    }
    public static void pattern11_01(int n) {
        int nst = 1;
        for(int r = 1; r <= n; r++){
            
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print(nst + "\t");
            nst++;
            System.out.println();
        }
    }
    public static void pattern11_02(int n) {
        int nst = 1, count=1;
        for(int r = 1; r <= n; r++){
            
            for(int cst = 1; cst <= nst; cst ++)
                System.out.print(count++ + "\t");
            nst++;
            System.out.println();
        }
    }
    public static void pattern11_03(int n) {
        int nst = 1, nsp = n/2;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.println("\t");
            
            int count = (r <= n/2 + 1 ? r : n-r+1);

            for(int cst = 1; cst <= nst; cst ++)
                System.out.print(count +  "\t");
            
            if(r <= n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n) {
        // int a = 0, b = 1;
        // for(int i = 0; i <= 7; i++){
        //     System.out.println(a + " ");
        //     int sum = a + b;
        //     a = b;
        //     b = sum;
        // }
        int nst = 1, a = 0, b = 1;
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= nst; cst ++){
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            
            nst++;
            System.out.println();
        }
    }
    public static void pattern13(int rows) {
        for(int n = 0; n <= rows; n++){
            int val = 1;
            for(int r = 0; r <= n; r ++){
                // System.out.print(n + "C" + r + "\t");
                System.out.print(val + "\t");
                val = ((n - r) * val)/(r + 1);
            }
            System.out.println();
        }
    }
    public static void pattern15(int n) {
        int nsp = n/2, nst = 1;
        for(int r = 1; r <= n; r++){
            //Loop for space
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
                int count = ( r<=n/2 +1) ? r : n - r +1;
            //Loop for stars
            for(int cst = 1; cst <= nst; cst ++){
                System.out.print(count + "\t");
                count = (cst <= nst/2) ? count + 1: count -1;
            }
            //relation between lines 
            if(r <= n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
    public static void pattern16(int n) {
        int nsp = 2*n-3, nst = 1;
        for(int r = 1; r <= n; r++){
            int count = 1;
            for(int cst = 1; cst <= nst; cst ++){
                System.out.print(count++ + "\t");
    
            }
            for(int csp = 1; csp <= nsp; csp ++)
                System.out.print("\t");
            
            if(r==n){
                nst--;
                count--;
            }
            for(int cst = 1; cst <= nst; cst ++){
                System.out.print(--count + "\t");
            }
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern0(n);
        pattern13(n);
    }
}
