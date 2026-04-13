
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of pattern : ");
        int n = scn.nextInt();

        int sp = n - 1;                     //sp stands for space
        int st = 1;                         //st stands for star
        for(int i = 1; i <= n; i++) {
            // System.out.print(sp+ "," +st);
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
