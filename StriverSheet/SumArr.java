
import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.print("sum of elements of an array : "+sum);
    }
}
