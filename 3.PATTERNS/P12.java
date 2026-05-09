public class P12 {
    public static void main(String[] args) {
        
        int n = 4;
        int sp = n - 1;
        int temp = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= sp; col++) {
                System.out.print("\t");
            }
            for (int col = 1; col <= temp; col++) {
                System.out.print(row + "\t");
            }
            sp--;
            temp+=2;
            System.out.println();
        }
    }
}