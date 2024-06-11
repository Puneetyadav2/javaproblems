import java.util.*;
public class ifelse2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("a is Equal b");
        }
        else if(a>b){
            System.out.println("a is Greater than b");
        }
        else{
            System.out.println("a is Less than b");
        }

        sc.close();


    }
    
}
