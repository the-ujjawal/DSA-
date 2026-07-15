
import java.util.Scanner;

public class Count {
    
    public static void inputArray(int ar[], Scanner scn){
        System.out.println("Enter "+ar.length+" elements : ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
    }

    public static int[] getCount(int ar[]){
        int zerosCount = 0;
        int onesCount = 0;

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == 0){
                zerosCount++;
            }
            else if(ar[i] == 1){
                onesCount++;
            }
        }

        return new int[] {zerosCount, onesCount};
    }

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scn.nextInt();

        int ar[] = new int[size];

        inputArray(ar, scn);

        int count[] = getCount(ar);
        System.out.println("Zeroes count : "+count[0]);
        System.out.println("ones count : "+count[1]);
    }
}
