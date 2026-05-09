
public class P13 {

    public static void main(String[] args) {

        // int n = 4;
        // int sp = n - 1;
        // int a = 'A' - 1;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= sp; col++) {
        //         System.out.print("\t");
        //     }
        //     for (int col = 1; col <= row; col++) {
        //         int b = a + col;
        //         char c = (char) b;
        //         System.out.print(c + "\t");
        //     }
        //     int temp = row - 1;
        //     for (int col = 1; col <= row - 1; col++) {
        //         int b = a + temp;
        //         char c = (char) b;
        //         System.out.print(c + "\t");
        //         temp--;
        //     }
        //     sp--;
        //     System.out.println();
        // }


//More better code
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("\t");
            }

            // increasing characters
            for (int col = 1; col <= row; col++) {
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + "\t");
            }

            // decreasing characters
            for (int col = row - 1; col >= 1; col--) {
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + "\t");
            }
            System.out.println();
        }
    }
}
