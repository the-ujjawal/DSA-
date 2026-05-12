import java.util.Scanner;

public class Product1D {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int ar[] = new int[3];
        int prod = 1;

        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter value at index "+i+" : ");
            ar[i] = scn.nextInt();
            prod = prod*ar[i];
        }
        System.out.println("Product of elements : "+prod);
        scn.close();
    }
}
