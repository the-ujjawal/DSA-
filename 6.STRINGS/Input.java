
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();              //nextInt() leaves Enter behind, so use an extra nextLine() to clean it before taking string input

        String name = sc.nextLine();

        System.out.println(age);
        System.out.println(name);
    }
}
