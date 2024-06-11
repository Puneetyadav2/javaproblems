import java.util.Scanner;

public class TwoDarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and cols:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int number[][]= new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(number[i][j]==x){
                    System.out.println("Element found at "+i+" "+j);
                }
            }
        }
        sc.close();
    }
    
}
