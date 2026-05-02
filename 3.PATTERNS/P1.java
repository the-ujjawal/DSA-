public class P1 {
    public static void main(String[] args) {

        // Inverted Isosceles triangle

        int n = 9;
        int sp = 0;
        int st = n;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= sp; col++) {
                System.out.print("\t");
            }
            for (int col = 1; col <= st; col++) {
                System.out.print("*\t");
            }
            sp++;
            st-=2;
            System.out.println();
        }



        //Isosceles triangle

        // int n = 5;
        // int sp = n-1;
        // int st = 1;
        // for (int row = 1; row <= 5; row++) {
        //     for (int col = 1; col <= sp; col++) {
        //         System.out.print("\t");
        //     }
        //     for (int col = 1; col <= st; col++) {
        //         System.out.print("*\t");
        //     }
        //     sp--;
        //     st+=2;
        //     System.out.println();
        // }


        //Rhombus

        // int n = 5;
        // int sp = n-1;
        // int st = n;
        // for (int row = 1; row <= 5; row++) {
        //     for (int col = 1; col <= sp; col++) {
        //         System.out.print("\t");
        //     }
        //     for (int col = 1; col <= st; col++) {
        //         System.out.print("*\t");
        //     }
        //     sp--;
        //     System.out.println();
        // }


        //Upside down triangle

        // int st = 5;
        // for (int row = 1; row <= 5; row++) {
        //     for (int col = 1; col <= st; col++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        //     st--;
        // }


        //triangle
        
        // for (int row = 1; row <= 5; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


        //Square

        // for (int row = 1; row <= 4; row++) {
        //     for (int col = 1; col <= 4; col++) {
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }


        //Rectangle

        // for (int row = 1; row <= 3; row++) {
        //     for (int col = 1; col <= 5; col++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
    }
}
