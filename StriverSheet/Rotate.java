import java.util.Scanner;

public class Rotate {

    public static void swapElement(int arr[],int st, int end){
            while(st < end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();
        System.out.print("Enter no. of rotations : ");
        int k = scn.nextInt();
        k = k%n;

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }

        // // rotation when k < n
        // int temp[] = new int[n];

        // int j = k;
        // for(int i = 0; i < n-k; i++){
        //     temp[i] = arr[j];
        //     j++;
        // }
        // int t = 0;
        // for(int i = n-k; i < n; i++){
        //     temp[i] = arr[t];
        //     t++;
        // }
        // for(int x : temp){
        //     System.out.print(x+" ");

        // }
        swapElement(arr,0,n-1);
        swapElement(arr,0,k-1);
        swapElement(arr,k,n-1);

        for(int x : arr){
            System.out.print(x+" ");
        }
        
    }    
}
