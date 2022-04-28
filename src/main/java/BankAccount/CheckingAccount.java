package BankAccount;

public class CheckingAccount extends Account {

    private int accountBalance = 0;

    public CheckingAccount(int amount) {
        if (amount < 0) {
            System.out.println("Расчетный счет не может быть отрицательным");
        } else {
            accountBalance = amount;
        }
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (accountBalance >= amount) {
            if (account.addMoney(amount)) {
                System.out.println("Произведен перевод с расчетного счета " + amount + " рублей на " + account + " cчет");
                accountBalance -= amount;
            } else {
                System.out.println("Перевод не возможен.");
            }
        } else {
            System.out.println("Недостаточно средств для перевода");
        }
    }

    @Override
    public int pay(int amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Платеж со сберегательного счета " + amount + " рублей");
        } else {
            System.out.println("Недостаточно средств");
        }
        return amount;
    }

    @Override
    public boolean addMoney(int amount) {
        accountBalance += amount;
        System.out.println("Пополнение расчетного счета на " + amount + " рублей");
        return true;
    }

    @Override
    public String toString() {
        return "расчетный";
    }
}
