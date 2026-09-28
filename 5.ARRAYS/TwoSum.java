import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        System.out.print("Enter target sum : ");
        int target = scn.nextInt();

        //Inupt should must contain sum equal to target
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Elements with sum equal to target are : "+arr[i]+"  "+arr[j]);
                }
            }
        }
    }
}
