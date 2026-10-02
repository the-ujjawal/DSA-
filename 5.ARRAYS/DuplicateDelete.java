import java.util.Scanner;

public class DuplicateDelete {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
       
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    for (int k = j; k < n-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    n--;                         //One element was deleted, so reduce the logical array size
                    j--;                         //After shifting, check the same position again because another duplicate may have moved there
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
