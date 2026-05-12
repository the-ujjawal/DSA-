
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        //1D Array

        // int ar[] = {2,3,5,7};
        // int sum = 0;

        // for (int i = 0; i < ar.length; i++) {
        //     sum = sum + ar[i];
        // }
        // System.out.println("Sum of elements : "+sum);

        
        //2D Array

        Scanner scn = new Scanner(System.in);
        int ar[][] = new int[2][3];
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print("Enter value at index "+i+" and "+j+" : ");
                ar[i][j] = scn.nextInt();
                sum = sum + ar[i][j];
            }
        }
        System.out.println("Sum of elements : "+sum);
    }
}
