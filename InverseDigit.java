
import java.util.Scanner;

public class InverseDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();

        int inv = 0;
        int op = 1;              //op means original position
        while(n != 0 ){
            int od = n % 10;     // od = original digit
            int id = op ;         // id = inverted digit
            int ip = od ;           //ip = inverted position

            //Make change to inv using ip and id

            inv = inv + id * (int)Math.pow(10, ip - 1);
            n = n / 10;
            op++;
        }
        System.out.println(inv);
    
    }
}
