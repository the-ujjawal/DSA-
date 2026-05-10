
public class Overload {

    public static void Display(int a) {
        System.out.println(a);
    }

    public static void Display(String b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Display(1);
        Display("Ujjawal");
    }
}
