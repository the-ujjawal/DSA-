public class Unsort {
    
    public static int getUnsorted(int ar[]){
        for (int i = 0; i < ar.length-1; i++) {
            if(ar[i+1] <= ar[i]){
                return ar[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[] = {1,3,6,7,5};

        int ans = getUnsorted(ar);
        System.out.println(ans);
    }
}
