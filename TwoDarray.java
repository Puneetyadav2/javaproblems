import java.util.Scanner;

public class TwoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and col:");
        int row=sc.nextInt();
        int cols=sc.nextInt();

        int number[][]= new int[row][cols];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
