import java.util.Scanner;

public class ReverseCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int n = scn.nextInt();

        int i = n;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }
        scn.close();
    }    
}
