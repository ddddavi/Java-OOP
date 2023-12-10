import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("John", "0001", 500);
        Account account2 = new Account("Mark", "0002", 1000);
        Account account3 = new Account("John", "0003", 300);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList < Account > accounts = bank.getAccounts();

        for(Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        bank.depositMoney(account1, 600);

        bank.withdrawMoney(account2, 1001);

        System.out.println(account1.getBalance());
    }
}
