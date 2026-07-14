
import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scn.nextInt();

        // Array made of user input
        int ar[] = new int[size];   

        System.out.println("Enter "+size+" elements : ");
        for (int i = 0; i < size; i++) {
            ar[i] = scn.nextInt();
        }

        System.out.print("Enter the multiplier with which all elements will be multiplied : ");
        int mul = scn.nextInt();

        // New array to store multiplied values
        int ans[] = new int[size];

        for(int i = 0; i < size; i++){
            int prod = ar[i] * mul;
            ans[i] = prod;
        }

        //Printing new array
        System.out.println("Elements after multiplying : ");
        for(int i : ans){
            System.out.println(i);
        }

        scn.close();
    }
}
