import java.util.*;

public class Frequency {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = scn.nextInt();
        }
        HashMap<Integer,Integer> Freq = new HashMap<>();
        for(int x : arr){
            Freq.put(x, Freq.getOrDefault(x,0)+1);

        }
        for(int x : Freq.keySet()){
            System.out.println("key "+x+" value "+Freq.get(x));
        }
    }
}
