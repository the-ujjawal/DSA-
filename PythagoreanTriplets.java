
import java.util.Scanner;

public class PythagoreanTriplets{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = scn.nextInt();
        System.out.println("Enter b : ");
        int b = scn.nextInt();
        System.out.println("Enter c : ");
        int c = scn.nextInt();

        int max = a;
        if(b >= max){
            max = b;
        }
        if(c >= max){
        max = c;
        }

        if(max == a){
            boolean flag = ((b*b+c*c)==(a*a));
            System.out.println(flag);

        }else if(max == b){
            boolean flag = ((a*a+c*c)==(b*b));
            System.out.println(flag);
            
        }else{
            boolean flag = ((b*b+a*a)==(c*c));
            System.out.println(flag);

        }
        scn.close();
    }
}