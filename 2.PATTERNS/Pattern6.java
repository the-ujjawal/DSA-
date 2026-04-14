import java.util.Scanner;

public class Pattern6 {
     public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of pattern : ");
        int n = scn.nextInt();

        int sp = 1;                             //sp stands for space
        int st = n/2+1;                         //st stands for star
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if( i <= n/2 ){
                sp += 2;
                st--;
            }else{
                sp -= 2;
                st++;
            }

            System.out.println();
        }
    }
}