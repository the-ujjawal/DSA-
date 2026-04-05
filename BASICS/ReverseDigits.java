
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();

        int nod = 0;
        while( n != 0 ){
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
            nod ++;
        }
    }
}
