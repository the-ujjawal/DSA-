
import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        while (right < n) {
            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
        // for (int i = left + 1; i < n; i++) {
        //     arr[i] = 0;
        // }

        // for (int x : arr) {
        //     System.out.print(x + " ");
        // }

        for (int i = 0; i <= left; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nUnique elements = " + (left + 1));
    }
}
