public class Character {

    static void printChar(String str) {

        if (str == null) {
            System.out.println("String is null");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        printChar("LOVE");
    }
}