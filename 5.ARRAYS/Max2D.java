
import java.util.Scanner;

public class Max2D {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int ar[][] = new int[2][3];
        int max = ar[0][0];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print("Enter elements at index "+i+"&"+j+" : ");
                ar[i][j] = scn.nextInt();
                if(max < ar[i][j]) {
                    max = ar[i][j];
                }
            }
        }
        System.out.println("Maximum among elements : "+max);
    }
}
