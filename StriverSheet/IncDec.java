
import java.util.*;

public class IncDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }

        // int temp[] = new int[n];
        // Arrays.sort(arr);
        // for (int i = 0; i < n/2; i++) {
        //     temp[i] = arr[i];

        // }
        // int t = n-1;
        // for (int i = n/2; i < n; i++) {
        //     temp[t] = arr[i];
        //     t--;
        // }
        // for (int i = 0; i < temp.length; i++) {
        //     System.out.print(temp[i]+" ");
        // }



        Arrays.sort(arr);
        int temp = 0;
        for(int i = 0; i < n; i++){
            if(i > n/2){
                arr[i] = temp;
                arr[i] = arr[n-1];
                arr[n-1] = temp;
                n--;
            }

        }
        System.out.print(arr[]);
    }
}
