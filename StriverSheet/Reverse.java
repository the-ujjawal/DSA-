
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();
        
        //int arr[] = new int[n];
    

        // for (int i = 0; i < n; i++) {
        //     System.out.print("Enter value at index "+i+" : ");
        //     arr[i] = scn.nextInt();
        // }

        // int temp[] = new int[n];
        // int j = 0;
        // for(int i = n-1; i >= 0; i--){
        //     temp[j] = arr[i];
        //     j++;
        // }
        // for(int i = 0; i < n; i++){
        //     System.out.print(temp[i]+" ");
        // }




        // int temp = 0;
        // int i = 0;
        // int j = n-1;
        // while(i<j){
        //     temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;

        // }
        // for(int num : arr){
        //     System.out.print(num +" ");
        // }


        ArrayList<Integer> arr = new ArrayList();
        for(int i = 0; i < n; i++){
            System.out.print("Enter value at index "+i+" : ");
            arr.add(scn.nextInt());
        }
        Collections.reverse(arr);
        System.out.println(arr);


    }
}
