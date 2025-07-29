
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter total numbers to be checked: ");
        int t = scn.nextInt();
        
        for (int i=0; i<t; i++){
            System.out.print("Enter numbers to be checked : ");
            int n = scn.nextInt();

            int count = 0;                          //count represent number of divisors

            // for (int div = 0; div <= n; div++) {
                
            // }                         
            // for (int div = 2; div <= n; div++){  // We made changes to decrease run time
                for (int div = 2; div*div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;                         //break is used to save run time
                }
            }
            if(count == 0){
                System.out.println("prime");

            } else {
                System.out.println("not prime");
            }
        }

    }
}