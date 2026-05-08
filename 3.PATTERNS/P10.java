
public class P10 {

    public static void main(String[] args) {

        int n = 8;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                // int a = col;
                // int b = ('A' + n);
                // int ans = b - a;
                // char temp = (char) ans;
                char temp = (char)('A' + n - col);        // simplified vbersion of above logic
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}
