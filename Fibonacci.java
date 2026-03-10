import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth number upto which fibonacci no. will be printed : ");
        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series : ");
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }

    }
}
