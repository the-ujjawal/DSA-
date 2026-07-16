
import java.util.Scanner;

public class RightShift {
    
    public static void inputArray(int ar[], Scanner scn){
       System.out.println("Enter "+ar.length+" elements : ");
       
       for (int i = 0; i < ar.length; i++) {
           ar[i] = scn.nextInt();
       }
    }

    public static void getRightshift(int ar[]){
        int temp = ar[ar.length-1];

        for (int i = ar.length-1; i > 0; i--) {
            ar[i] = ar[i-1];
        }
        ar[0] = temp;
        
        System.out.print("Array after right shift : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scn.nextInt();

        int ar[] = new int[size];
        inputArray(ar, scn);

        getRightshift(ar);
    }
}
