import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter divisor : ");
        int div = scn.nextInt();
        System.out.print("Enter lower range : ");
        int l = scn.nextInt();
        System.out.print("Enter enter higher range : ");
        int h = scn.nextInt();

        System.out.print("Number divisible by "+div+" between "+l+" to "+h+" are : ");
        for (int i = l; i <= h; i++) {
            if(i % div == 0) {
                System.out.print(i+ "  ");
            }
        }
    }
}
