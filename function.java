import java.util.*;
public class function {
    public static void factorial(int n){
        int factorial = 1;
        for (int i=n;i>=1;i--)
        factorial=factorial * i;

        System.out.println(factorial);
    }

    // public static void sum(int a, int b){
    //     int sum=a+b;
    //     System.out.println(sum);

    // }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // // sum(a,b);
        
        int n=sc.nextInt();

        factorial(n);
        sc.close();



    }
    
}
