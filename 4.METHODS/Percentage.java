public class Percentage {
    
    // public static void CalculatePercent(int obtained, int total) {
    //     int percent = (obtained * 100) / total;
    //     System.out.println(percent);
    // }

    // public static void main(String[] args) {
    //     CalculatePercent(50, 200);
    //}


    // using call by value
    public static int CalculatePercent(int obtained, int total) {
        int percent = (obtained * 100) / total;
        return percent;
    }

    public static void main(String[] args) {
        int n = CalculatePercent(105, 150);
        System.out.println(n);
    }
    
}
