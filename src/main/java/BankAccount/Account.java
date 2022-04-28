package BankAccount;

public abstract class Account {

    private int accountBalance;

    public int getAccountBalance() {
        return accountBalance;
    }

    public abstract int pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);
}
