
import java.util.Scanner;

public class Extreme {
    
    public static void inputArray(int ar[], Scanner scn){
        System.out.println("Enter "+ar.length+" elements : ");

        for(int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
    }
    public static void getExtreme(int ar[]){
        int i = 0;
        int j = ar.length-1;

        System.out.println("Extreme elements : ");
        while(i <= j){
            System.out.println(ar[i]);

            if(i != j){
                System.out.println(ar[j]);
            }
            i++;
            j--;
        }
    }
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scn.nextInt();

        int ar[] = new int[size];
        inputArray(ar, scn);

        getExtreme(ar);
    }
}
