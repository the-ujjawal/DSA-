public class P4 {
    public static void main(String[] args) {
        
        int n = 5;
        int st = 1;
        int sp = n - 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= sp; col++) {
                System.out.print("\t");
            }
            for (int col = 1; col <= st; col++) {
                if(row == 1 || row == n) {
                    System.out.print("*\t");
                }else{
                    if(col == 1 || col == st){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            st+=2;
            sp--;
            System.out.println();
        }
    }
}
