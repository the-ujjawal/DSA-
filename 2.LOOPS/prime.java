public class prime {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int div = 2; div*div <= i; div++) {
                if(i % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
