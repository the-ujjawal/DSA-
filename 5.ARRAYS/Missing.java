import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();

        //Inupt should be between 0 to n
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        int sumRange = 0;
        for (int i = 0; i <= n; i++) {
            sumRange = sumRange + i;
        }
        System.out.println("sum of range : "+sumRange);
        
        int sumElement = 0;
        for (int i = 0; i < n; i++) {
            sumElement = sumElement + arr[i];
        }
        System.out.println("sum of elements : "+sumElement);

        int missingElement = sumRange - sumElement;
        System.out.println("Missing Element : "+missingElement);
    }
}
