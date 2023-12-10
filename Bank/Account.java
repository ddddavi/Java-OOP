public class Account {
    private String name;
    private String accountId;
    private double balance;

    public Account(String name, String accountId, double balance) {
        this.name = name;
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if((balance-amount) < 0) {
            System.out.println(name + " your balance would be below 0!");
        } else {
            balance -= amount;
        }
    }

    public String getAccountInfo() {
        return "Name: " + name + " Account ID: " + accountId + " balance " + balance;
    }
}
