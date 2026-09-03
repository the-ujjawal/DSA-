import java.util.*;

public class HighFrequency {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }
        Map<Integer,Integer> High = new HashMap<>();
        for(int x : arr){
            High.put(x,High.getOrDefault(x,0)+1);
        }
        int key = 0;
        int val = 0;

        for(int x : High.keySet()){
            int curr = High.get(x);
            if(val < curr){
                val = curr;
                key = x;
            }
        }
        System.out.print("Key "+key+" value "+val);
    }        
}
