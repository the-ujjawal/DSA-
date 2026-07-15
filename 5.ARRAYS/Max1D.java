import java.util.Scanner;

public class Max1D {
    // public static void main(String[] args) {
        
    //     int ar[] = {5,33,4,48,87,45,66};
    //     int max = ar[0];

    //     for (int i = 1; i <= ar.length-1; i++) {
    //         if(max < ar[i]) {
    //             max = ar[i];
    //         }
    //     }
    //     System.out.println(max);
    // }


    //by using methods and taking user input
    public static void inputArray(int ar[], Scanner sc){
        System.out.println("Enter "+ar.length+" elements : ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
    }
    public static int findMax(int ar[]){
        int max = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if(max < ar[i]){
                max = ar[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int ar[] = new int[size];

        inputArray(ar, sc);

        int max = findMax(ar);

        System.out.println("Maximum element : "+max);

        sc.close();
    }
}
