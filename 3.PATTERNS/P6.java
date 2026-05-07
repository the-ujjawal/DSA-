
public class P6 {

    public static void main(String[] args) {

        int n = 8;
        int ust = 1;
        int lst = n/2;
        int usp = n - 2;
        int lsp = 0;

        for (int row = 1; row <= n; row++) {
            if (row <= n / 2) {
                for (int col = 1; col <= ust; col++) {
                    System.out.print("*\t");
                }
                for (int col = 1; col <= usp; col++) {
                    System.out.print("\t");
                }
                for (int col = 1; col <= ust; col++) {
                    System.out.print("*\t");
                }
                ust++;
                usp-=2;
                System.out.println();
            } else {
                for (int col = 1; col <= lst; col++) {
                    System.out.print("*\t");
                }
                for (int col = 1; col <= lsp; col++) {
                    System.out.print("\t");
                }
                for (int col = 1; col <= lst; col++) {
                    System.out.print("*\t");
                }
                lsp+=2;
                lst--;
                System.out.println();
            }
        }
    }
}
