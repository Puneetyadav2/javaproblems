import java.util.Scanner;

public class array1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int number[]=new int[size];

        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);
        sc.close();

    }
    
}
