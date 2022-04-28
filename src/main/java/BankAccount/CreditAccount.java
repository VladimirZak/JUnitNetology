package BankAccount;

public class CreditAccount extends Account {

    private int accountBalance = 0;

    public CreditAccount(int amount) {
        if (amount > 0) {
            System.out.println("Кредитный счет не может быть положительным");
        } else {
            this.accountBalance = amount;
        }
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (account.addMoney(amount)) {
            System.out.println("Произведен перевод с кредитного счета " + amount + " рублей на " + account + " cчет");
            accountBalance -= amount;
        } else {
            System.out.println("Перевод не возможен.");
        }
    }

    @Override
    public int pay(int amount) {
        accountBalance -= amount;
        System.out.println("Платеж с кредитного счета " + amount + " рублей");
        return amount;
    }

    @Override
    public boolean addMoney(int amount) {
        if (Math.abs(accountBalance) >= amount) {
            accountBalance += amount;
            System.out.println("Погашение кредита на " + amount + " рублей");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "кредитный";
    }
}
