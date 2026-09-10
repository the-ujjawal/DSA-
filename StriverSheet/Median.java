import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        float med = 0;
        // int temp1 = 0;
        // int temp2 = 0;
        // for (int i = 0; i < n; i++) {
        //     if(n%2==1){
        //         if(i==n/2){
        //             med = arr[i];
        //         }
        //     }
        //     else if(n%2==0){
        //         if(i==(n/2)-1){
        //             temp1 = arr[i];
        //         }
        //         if(i==n/2){
        //             temp2 = arr[i];
        //         }
        //         med = (float) (temp1 + temp2) / 2;
        //     }
        // }


        //Better code
        if (n % 2 == 1) {
            med = arr[n / 2];
        } else {
            med = (arr[n / 2 - 1] + arr[n / 2]) / 2.0f;
        }
        System.out.println(med);
    }
}
