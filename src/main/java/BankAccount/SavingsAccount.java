package BankAccount;

public class SavingsAccount extends Account {

    private int accountBalance = 0;

    public SavingsAccount(int amount) {
        if (amount < 0) {
            System.out.println("Сберегательный счет не может быть отрицательным");
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
                System.out.println("Произведен перевод со сберегательного счета " + amount + " рублей на " + account + " cчет");
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
        System.out.println("С этого счета нельзя платить");
        return amount;
    }

    @Override
    public boolean addMoney(int amount) {
        accountBalance += amount;
        System.out.println("Пополнение сберегательного счета на " + amount + " рублей");
        return true;
    }

    @Override
    public String toString() {
        return "сберегательный";
    }
}
