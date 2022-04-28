package BankAccountTest;

import BankAccount.Account;
import BankAccount.CheckingAccount;
import org.junit.jupiter.api.*;

public class CheckingAccountTest {

    Account checkingAccount;

    @BeforeAll
    public static void BeforeAll() {

        System.out.println("Запуск тестов");
    }

    @AfterAll
    public static void AfterAll() {

        System.out.println("Завершение тестов");
    }

    @BeforeEach
    public void BeforeEachMethod() {
        System.out.println("Тест запущен");
    }

    @AfterEach
    public void AfterEachMethod() {
        System.out.println("Тест завершен");
    }

    @Test
    public void pay() {
        int amount = 10, expected = 10;
        checkingAccount = new CheckingAccount(amount);

        int result = checkingAccount.pay(amount);

        Assertions.assertEquals(expected, result);
    }
}
