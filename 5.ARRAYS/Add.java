
import java.util.Scanner;

public class Add{

    public static void inputArray(int ar[], Scanner scn){
        System.out.println("Enter "+ar.length+" elements : ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
    }

    public static int[] getPosNeg(int ar[]){
        int posAdd = 0;
        int negAdd = 0;

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] > 0){
                posAdd = posAdd + ar[i];
            }
            else{
                negAdd = negAdd + ar[i];
            }
        }

        int ans[] = {posAdd, negAdd};
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size = scn.nextInt();

        int ar[] = new int[size];

        inputArray(ar, scn);

        int ans[] = getPosNeg(ar);
        System.out.println("Positive sum : "+ans[0]);
        System.out.println("Negative sum : "+ans[1]);


    }
}