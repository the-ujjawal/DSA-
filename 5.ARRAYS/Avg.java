import java.util.Scanner;

public class Avg {
    public static void main(String[] args){

        // int ar[] = {3,2,5,6};
        // double avg;
        // double sum = 0;
        // int size = ar.length;

        // for (int i = 0; i < ar.length; i++) {
        //     sum = sum + ar[i];
        // }
        // avg = sum/size;
        // System.out.println(avg);



        //by taking user input
        Scanner scn  = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scn.nextInt();

        int ar[] = new int[size];

        System.out.println("Enter "+size+ " elements : ");
        for(int i = 0; i < size; i++){
            ar[i] = scn.nextInt();
        }
        
        double sum = 0;
        for(int i : ar){
            sum += i;
        }
        double avg = sum/size;
        System.out.print("Average of elements of array is : "+avg);

        scn.close();
    }
}
