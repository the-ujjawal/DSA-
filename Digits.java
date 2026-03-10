import java.util.Scanner;

public class digits {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();

        int nod = 0;                       //nod = no. of digits of the number n
        int temp = n;                      //temp is used so that value of n should remain unchanged for later uses
        while( temp != 0 ){
            temp = temp / 10;
            nod ++;
        }
        int div = (int)Math.pow(10, nod - 1);
        while( div != 0 ){
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div /10;
        }

    }
}
