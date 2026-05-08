public class P7 {
    public static void main(String[] args) {
        
        int n = 11;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }
}
