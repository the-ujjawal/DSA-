public class Sum {
    public static void main(String[] args) {
        int ar[] = {2,3,5,7};
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        System.out.println("Sum of elements : "+sum);
    }
}
