
public class P9 {

    public static void main(String[] args) {

        int n = 9;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a + b;
                char temp = (char) ans;
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}
