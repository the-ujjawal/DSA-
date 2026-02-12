
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    
        // int count = 0;
        // for(int div = 1; div <= n; div++){
        //     if(n % div == 0){
        //         count ++;
        //     }                                          //this code has higher time complexity
        // }
        // if(count == 2){
        //     System.out.println("prime");
        // }else{
        //     System.out.println("not prime");

        int count = 0;
        for(int div = 2; div * div <= n; div++) {
            if(n % div == 0){
                count ++;
            } 
        }
        if(count == 0){
            System.err.println("prime");
        }else{
            System.err.println("not prime");
        }
            
    }

}

