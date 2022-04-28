package BankAccount;

public class Main {

    public static void main(String[] args) {

        Account savingAccount = new SavingsAccount(1000);
        Account checkingAccount = new CheckingAccount(100);
        Account creditAccount = new CreditAccount(0);

        printBalanceAccount(savingAccount);
        printBalanceAccount(checkingAccount);
        printBalanceAccount(creditAccount);

        creditAccount.transfer(savingAccount, 1000);
        savingAccount.transfer(checkingAccount, 2000);
        checkingAccount.transfer(creditAccount, 900);
        checkingAccount.transfer(creditAccount, 900);

        printBalanceAccount(creditAccount);
        printBalanceAccount(savingAccount);
        printBalanceAccount(checkingAccount);
    }

    public static void printBalanceAccount(Account account) {
        System.out.println(account + " счет равен " + account.getAccountBalance() + " рублей");
    }
}
