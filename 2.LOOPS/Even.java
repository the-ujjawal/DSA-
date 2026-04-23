
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int l = scn.nextInt();
        System.out.print("Enter higher range : ");
        int h = scn.nextInt();

        for (int i = l; i < h; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
