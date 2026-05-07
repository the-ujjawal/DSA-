public class P5 {
    public static void main(String[] args) {
        
        int n = 4;
        int ust = 1;                              //upper star
        int sp = n - 1;                           //spaces

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= sp; col++) {
                System.out.print("\t");
            }
            for (int col = 1; col <= ust; col++) {
                if(col == 1 || col == ust){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            ust+=2;
            sp--;
            System.out.println();
        }
      
        int lst = n+1;                            // lower star

        for (int row = 1; row <= n-1; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("\t");
            }
            for (int col = 1; col <= lst; col++) {
                if(col == 1 || col == lst){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            lst-=2;
            sp++;
            System.out.println();
        }    
    }
}
