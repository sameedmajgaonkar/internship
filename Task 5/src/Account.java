import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private User user;
    private List<Integer> transactionHistory = new ArrayList<>();
    Account(User user, int balance) {
        this.user = user;
        this.balance = balance;
    }

    Account(User user) {
        this.user = user;
    }

    public void deposit(int amount) {
        balance += amount;
        transactionHistory.add(amount);
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        transactionHistory.add(-amount);
    }

    public int getBalance() {
        return balance;
    }

    public void showTransactionHistory() {
        System.out.println("TRANSACTION HISTORY:");
        transactionHistory.forEach(System.out::println);
    }
}
