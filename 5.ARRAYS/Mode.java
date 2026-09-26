import java.util.*;

public class Mode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> mode = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mode.put(arr[i], mode.getOrDefault(arr[i],0)+1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        for(int key : mode.keySet()) {
            if(mode.get(key) > maxFreq) {
                maxFreq = mode.get(key);
                maxFreqKey = key;
            }
        }
        System.out.println("Mode : " + maxFreqKey);
        System.out.println("Frequency : " + maxFreq);
    }


    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     System.out.print("Enter size of array : ");
    //     int size = scn.nextInt();

    //     int arr[] = new int[size];
    //     inputArray(arr, scn);

    //     System.out.println("Mode of array : "+getMode(arr));

    // }

    // public static void inputArray(int arr[], Scanner scn){

    //     for(int i = 0; i < arr.length; i++) {
    //         System.out.print("Enter element at index " + i + " : ");
    //         arr[i] = scn.nextInt();
    //     }
    // }

    // public static int getMode(int arr[]){
    //     HashMap<Integer, Integer> freq = new HashMap<>();
        
    //     for(int num : arr){
    //         freq.put(num, freq.getOrDefault(num,0)+1);
    //     }

    //     int maxFreq = -1;
    //     int maxFreqKey = -1;

    //     for(int key : freq.keySet()){
    //         int currentKey = key;
    //         int currentKeyFreq = freq.get(key);
    //         if(currentKeyFreq > maxFreq){
    //             maxFreq = currentKeyFreq;
    //             maxFreqKey = currentKey;
    //         }
    //     }
    //     return maxFreqKey;
    // }
}

