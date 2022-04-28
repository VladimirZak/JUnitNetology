package BankAccountTest;

import BankAccount.Account;
import BankAccount.SavingsAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SavingsAccountTest {

    Account savingAccount;

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
    public void testAddMoney() {
        // given:
        int amount = 10;

        // when:
        savingAccount = new SavingsAccount(0);
        boolean result = savingAccount.addMoney(amount);

        // then:
        assertTrue(result);
    }

    @Test
    public void testGetAccountBalance() {
        int amount = 10, expected = 10;

        savingAccount = new SavingsAccount(amount);
        int result = savingAccount.getAccountBalance();

        assertEquals(expected, result);
    }
}


