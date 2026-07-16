import java.util.Scanner;

public class Reverse {
    
    public static void inputArray(int ar[], Scanner scn){
        System.out.println("Enter "+ar.length+" elements : ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
    }

    public static void getReverse(int ar[]){
        int n = ar.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;

            i++;
            j--;
        }
        System.out.println("Reverse of array : ");
        for(int k = 0; k < ar.length; k++){
            System.out.println(ar[k]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scn.nextInt();

        int ar[] = new int[size];
        inputArray(ar, scn);

        getReverse(ar);
    }
}
