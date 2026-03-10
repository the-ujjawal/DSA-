
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();

        System.out.print("Count of digits : ");

        int dig = 0;
        while( n != 0 ){
            n = n / 10;
            dig ++;
        }
        System.out.println(dig);
    }
}

