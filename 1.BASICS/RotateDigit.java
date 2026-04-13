
import java.util.Scanner;

public class RotateDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();
        System.out.print("Enter numer of rotations : ");
        int k = scn.nextInt();

        int temp = n;
        int nod = 0;
        while( temp > 0 ){
            temp = temp / 10;
            nod++;
        }

        k = k % nod;
        if( k < 0 ){
            k = k + nod;
        }

        int div = 1;
        int mul = 1;
        for(int i = 1; i <= nod; i++){
            if( i <= k ){
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int rot = r * mul + q;
        System.out.print("Number after "+k+ " time of rotation : "+rot);
    }
}
