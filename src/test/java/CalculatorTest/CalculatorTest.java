package CalculatorTest;

import Calculator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {

    Calculator calc;

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
        calc = Calculator.instance.get();
        System.out.println("Тест запущен");
    }

    @AfterEach
    public void AfterEachMethod() {
        System.out.println("Тест завершен");
    }

    @Test
    public void multiplyMethod() {

        int a = 2, b = 4, expected = 8;

        int result = calc.multiply.apply(a, b);

        Assertions.assertEquals(expected, result);
        assertThat(result, is(greaterThan(0)));

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 657, -21, 0})
    public void multiplyMethodTest(int a) {
        int b = 0, expected = 0;

        int result = calc.multiply.apply(a, b);

        Assertions.assertEquals(expected, result);
    }
}
