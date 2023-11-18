package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    public static void setUpMsgAll() {
        System.out.println("Testing started!");
    }

    @BeforeEach
    public void setUpMsgEach(TestInfo testInfo) {
        System.out.println("Test " + testInfo.getDisplayName() + " started");
    }

    @AfterAll
    public static void testEndingAll() {
        System.out.println("Testing has ended!");
    }

    @AfterEach
    public void testEndingEach(TestInfo testInfo) {
        System.out.println("Test " + testInfo.getDisplayName() + " has ended");
    }

    @ParameterizedTest(name = "Sum checking #{index} (where a equals {0}, b equals {1} " +
            "with expected result {2})")
    @DisplayName("Sum checking (parameterized)")
    @CsvSource({"2, 2, 4", "-2, 2, 0", "5, 4, 9"})
    @Tag("sum")
    void sum(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summation(a, b);
        Assertions.assertEquals(expectedResult, result, "Wrong result of calculation!");
    }

    @ParameterizedTest(name = "Difference checking #{index} (where a equals {0}, b equals {1} " +
            "with expected result {2})")
    @DisplayName("Difference checking (parameterized)")
    @CsvSource({"2, 2, 0", "-2, 2, -4", "5, 4, 1"})
    @Tag("diff")
    void difference(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.subtraction(a, b);
        Assertions.assertEquals(expectedResult, result, "Wrong result of calculation!");
    }

}