public class P2 {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 5; col++) {
                if(row == 1 || row ==n){
                    System.out.print("*\t");
                }else{
                    if(col == 1 || col == 5) {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }            
            System.out.println();
        }
    }
}
