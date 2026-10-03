import java.util.*;

public class MissingElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
       
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        List<Integer> lis = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);           //+ve values
            int pos = value - 1;
            if(arr[pos]>0){
                arr[pos] = -arr[pos];               //marking poistion
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){                          //already all indices are marked -ve
                lis.add(i+1);
            }
        }
        System.out.println(lis);
    }
}
