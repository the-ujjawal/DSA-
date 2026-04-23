

public class Reverse {
    public static void main(String[] args) {
        
       int n = 1235;
    //   int rev = 0;
       while(n>0)
       {
        int rem = n%10; // 5
       // rev = rev*10+rem;
        System.out.println(rem);
        n/=10;
       }
    }
}
