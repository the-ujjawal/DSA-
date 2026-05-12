public class Max1D {
    public static void main(String[] args) {
        
        int ar[] = {5,33,4,48,87,45,66};
        int max = ar[0];

        for (int i = 1; i <= ar.length-1; i++) {
            if(max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println(max);
    }
}
