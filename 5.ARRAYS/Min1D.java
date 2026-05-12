public class Min1D {
    public static void main(String[] args) {
        
        int ar[] = {5,33,4,48,87,45,66};
        int min = ar[0];

        for (int i = 1; i <= ar.length-1; i++) {
            if(min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println(min);
    }
}
