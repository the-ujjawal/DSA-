import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int l = scn.nextInt();
        System.out.print("Enter higher range : ");
        int h = scn.nextInt();
        
        for (int i = l; i <= h; i++) {

            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if(i % div == 0){
                    count ++;
                    break;                                // break is used to save time 
                }    
            }
            if(count == 0){
                System.out.println(i);
            }
        }
        
    }
}
