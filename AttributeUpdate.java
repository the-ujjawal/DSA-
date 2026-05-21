public class AttributeUpdate {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.balance = 1000;

        b1.deposit(500);

        b1.showBalance();
    }
}

class BankAccount {

    //String accountHolder;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void showBalance() {
        System.out.println(balance);
    }
}