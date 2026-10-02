import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
       
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        //piviot index = sum of left elements equals to sum of right elements 
        int sumLeft[] = new int[n];
        int sumRight[] = new int[n];
        
        sumLeft[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sumLeft[i] = sumLeft[i-1]+arr[i];
        }

        sumRight[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            sumRight[i] = sumRight[i+1]+arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(sumLeft[i] == sumRight[i]){
                System.out.println(i);
            }
        }
    }    
}
