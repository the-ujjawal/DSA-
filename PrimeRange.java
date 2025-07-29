import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter lower range : ");
        int l = scn.nextInt();

        System.out.println("Enter higher range");
        int h = scn.nextInt();

        System.out.println("Prime numbers are :");

        for (int i = l; i <= h; i++) {

            int count = 0;                         //count represent number of times divided

            for (int div = 2; div*div <= h; div++){
                if(i % div == 0){
                    count++;
                    break;                         //break is used to save run time
                }
            }
           
            if(count == 0){
                System.out.println(i);
            }
        }


    }
}
