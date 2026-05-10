public class Even {
    
    // public static void IsEven(int n) {
    //     if(n%2==0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //     }
    // }
    // public static void main(String[] args) {
    //     IsEven(22);
    // }

    public static boolean IsEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        boolean ans = IsEven(21);
        System.out.println(ans);
    }
}
