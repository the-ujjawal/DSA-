public class Update {

    public static void Updatevalue(int x){
        x = x + 10;
        System.out.println("Value inside method : " + x);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Before method call : "+n);

        Updatevalue(n);
        System.out.println("After method call : "+n);
    }
}