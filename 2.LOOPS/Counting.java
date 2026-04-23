
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int n = scn.nextInt();

        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
        scn.close();
    }    
}
