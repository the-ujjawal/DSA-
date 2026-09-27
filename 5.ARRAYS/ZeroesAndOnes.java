import java.util.Scanner;

public class ZeroesAndOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scn.nextInt();

        //Inupt should be zeroes and ones only
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        int i = 0;
        int j = size-1;
        while(i<j){
           if(arr[i]==1 && arr[j]==0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }if(arr[i]==0){
            i++;
           }
           if(arr[j]==1){
            j--;
           }
        }
        
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k]+" ");
        }     
    }
}
