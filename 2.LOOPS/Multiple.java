
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();
        System.out.print("Enter number of multiples : ");
        int m = scn.nextInt();

        System.out.print(m + " multiples of " + n + " is ");

        //USING FOR LOOP:

        // for (int i = 1; i <= m; i++) {
        //     System.out.print((n * i) + "\t");
        // }

        //USING WHILE LOOP:
        int i = 1;
        while(i <= m) {
            System.out.print((n * i) + "\t");
            i++;
        }
        scn.close();
    }
}
