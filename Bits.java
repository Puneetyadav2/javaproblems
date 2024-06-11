import java.util.*;
public class Bits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=1;

        int bitMask = 1<<pos;
        // int notbitMask = ~(bitMask);

        // if((bitMask & n)==0){
        //     System.out.println("Bit is 0");
        // }
        // else{
        //     System.out.println("Bit is 1");
        // }
        // int newnumber =bitMask | n;
        // System.out.println(newnumber);

        // int newnumber= notbitMask & n;
        // System.out.println(newnumber);

        //set
        if(oper==1){
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        }
        //clear
        else{
            int newBitMask = ~(bitMask);
            int newnumber = newBitMask & n;
            System.out.println(newnumber);
        }
        sc.close();


    }
    
}
