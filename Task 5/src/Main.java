public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Sameed");
        Account account = new Account(user);
        account.deposit(100);
        account.withdraw(50);

        account.showTransactionHistory();
    }
}
