
import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value at index "+i+" : ");
            arr[i] = scn.nextInt();
        }

        int temp = arr[0];

        //Smallest

        // for (int i = 1; i < n; i++) {
        //     if (temp > arr[i]) {
        //         temp = arr[i];

        //     }

        //Largest
        for (int i = 1; i < n; i++) {
            if(temp < arr[i]){
                temp = arr[i];

            }

        }
        System.out.println("Largest element :"+temp);

    }
}
