import java.util.*;
public class SecondSmall {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
    
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter value at index" +i+ " : ");
            arr[i] = scn.nextInt();
        }

        // int min1 = arr[0];
        // int min2 = arr[0];

        // for(int i = 1; i < n; i++){
        //     int curr = arr[i];
        //     if(curr < min1){
        //         min2 = min1;
        //         min1 = curr;
        //     }else if(curr < min2 && arr[i] != min1){
        //         min2 = arr[i];
        //     }
        //     //System.out.println(min1 + " " + min2);
            
        // }
        // System.out.println("Second Smallest element : "+min2);


        //Second Largest

        int max1 = arr[0];
        int max2 = 0;

        for(int i = 0; i < n; i++){
            int curr = arr[i];
            if(curr > max1){
                max2 = max1;
                max1 = curr;

            }else if(curr > max2 && curr != max1){
                max2 = curr;
            }
            System.out.println(max1+" "+max2);
        }
        System.out.println("Second largest : "+max2);

    }
}
