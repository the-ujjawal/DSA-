
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        //int n = sc.nextInt()
        long n = sc.nextLong();             //long is used instead of int to count large numbers

        int count = 0;
        while (n != 0) {
            n = n/10;
            count++;  
        }
        System.out.println("Number of digits : " +count);
        
    }
}

