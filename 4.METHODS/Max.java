
public class Max {

    public static int GetMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = GetMax(9, 7);
        System.out.println(n);
    }
}
