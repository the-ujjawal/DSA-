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
        int maxElement = 0;
        int maxFreq = 0;

        for(int key : High.keySet()){
            int freq = High.get(key);
            if(maxFreq < freq){
                maxFreq = freq;
                maxElement = key;
            }
        }
        System.out.print("Key "+maxFreq+" value "+maxElement);
    }        
}
