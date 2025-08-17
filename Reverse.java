
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scn.nextInt();

        // int count = 0;
        // while(n > 0){
        //     n = n / 10;
        //     count++;
        // }
        // int div = (int)Math.pow(10, count - 1);
        // int rev = 0;
        while(n != 0){
            int dig = n % 10;
            // rev = rev * 10 + r;
            n = n / 10;
            System.out.print(dig);
        }
    }
}
