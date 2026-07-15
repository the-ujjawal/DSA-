// import java.util.Scanner;

public class LinearSearch{
//     public static void main(String[] args) {
        
//         Scanner scn = new Scanner(System.in);
//         System.err.print("Enter size of array : ");
//         int size = scn.nextInt();

//         int ar[] = new int[size];

//         System.err.println("Enter "+size+" elements : ");
//         for (int i = 0; i < size; i++) {
//             ar[i] = scn.nextInt();
//         }

//         System.err.print("Enter target element for search : ");
//         int target = scn.nextInt();

//         boolean found = false;
//         for (int i = 0; i < size; i++) {
//             if (ar[i] == target) {
//                 found = true;
//                 break;
//             }    
//         }
//         if(found){
//             System.err.println("True");
//         }else{
//             System.err.println("False");
//         }
//         scn.close();
//     }



//by using methods
    public static boolean findTarget(int ar[], int target){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6};
        boolean ans = findTarget(ar, 9);
        System.err.println(ans);
    }
}




