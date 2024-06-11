import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the operation (+,-,*,/,%)");
        String op = sc.next();
        int result =0;
        

        switch(op){
            case "+":
             result= a+b; 
             break;
            case "-": 
             result= a-b; 
             break;
            case "*":
             result= a*b; 
             break;
            case "/":
             result= a/b;
             break;
            case "%":
             result= a%b;
             break;

            default: System.out.println("You Enter wrong input"); break;

        }
        System.out.println("The final result");
        System.out.println(a + " " + op + " " + b+ " = " + result);
        sc.close();
                          


    }
    
}
