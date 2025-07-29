import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of times to be printed : ");
        int n = scn.nextInt();

        System.out.println("Fibonacci series : ");
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
