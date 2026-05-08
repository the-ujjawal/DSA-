
public class P11 {

    public static void main(String[] args) {

        int n = 6;
        int sp = n - 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= sp; col++) {
                System.out.print("\t");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "\t");
            }
            int temp = row - 1;
            if (row > 1) {
                for (int col = 1; col <= row - 1; col++) {
                    System.out.print(temp + "\t");
                    temp--;
                }
            }
            sp--;
            System.out.println();
        }
    }
}
