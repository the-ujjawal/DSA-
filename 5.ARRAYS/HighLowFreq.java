import java.util.*;

public class HighLowFreq{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.print("Enter Size of array : ");
        int size = scn.nextInt();

        int arr[] = new int[size];
        inputArray(arr, scn);

        int ans[] = getFreq(arr);
        System.out.println("Highest frequency element : "+ans[0]);
        System.out.println("Lowest frequency element : "+ans[1]);
        
    }

    public static void inputArray(int arr[], Scanner scn){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }
    }

    public static int[] getFreq(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int highFreq = Integer.MIN_VALUE;
        int highNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highFreq){
                highFreq = currentFreq;
                highNum = currentKey;
            }
        }
        int lowFreq = Integer.MAX_VALUE;
        int lowNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowFreq){
                lowFreq = currentFreq;
                lowNum = currentKey;
            }
        }
        int ans[] = {highNum, lowNum};
        return ans;
    }
}