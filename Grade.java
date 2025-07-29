
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = scn.nextInt();

        if(marks > 90){
            System.err.println("excellent");

        }else if(marks > 80){
            System.err.println("good");

        }else if (marks > 70) {
            System.err.println("fair");
            
        }else if (marks > 60) {
            System.err.println("meets expection");
            
        }else{
            System.err.println("below par");
        }
    }
}
