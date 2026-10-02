import java.util.*;

public class FirstRepeating{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
       
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }
        // int temp = 0;
        // for (int i = 0; i < n-1; i++) {
        //     for (int j = i+1; j < n; j++) {
        //         if(arr[i]==arr[j])
        //             temp = arr[j];
        //             break;
        //     }
        // }
        // System.out.println(temp);


        HashMap<Integer, Integer> fr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            fr.put(arr[i], fr.getOrDefault(arr[i], 0)+1);
        }
        for (int num : arr) {
            if(fr.get(num)>1){
                System.out.println(num);
                break;
            }
        }
    }
}