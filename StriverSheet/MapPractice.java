
import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++ ){
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }

        Map<Integer,Integer> fr = new HashMap<>();

        for(int x : arr){
            fr.put(x, fr.getOrDefault(x, 0)+1);
        }

        int element = 0;
        int lowFreq = Integer.MAX_VALUE;
        
        for(int key : fr.keySet()){
            int curr = fr.get(key);
            if(curr < lowFreq){
                lowFreq = curr;
            }
        }
        for(int x : fr.keySet()){
            if(fr.get(x) == lowFreq){
                element = x;
                System.out.println("Lowest element : "+element+" with frequency : "+lowFreq);
            }
        }
        
    }
}
