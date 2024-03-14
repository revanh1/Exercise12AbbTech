package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTestNegative {
    Calculator calculator;
    Calculator calculatorAnother;

    @BeforeEach
    void init(){
        calculator = new Calculator();
        calculatorAnother = new Calculator();
    }

    @Test
    void additionTest(){
        var actualResult = calculator.addition(4, 5);
        Assertions.assertTrue(7 == actualResult);
    }

    @Test
    void substractionTest(){
        var actualResult = calculator.substraction(5, 2);
        Assertions.assertFalse(3 == actualResult);
    }

    @Test
    void multiplicationTest(){
        var actualResult = calculator.multiplication(4, 5);
        Assertions.assertNull(actualResult);
//        Assertions.assertNotNull(actualResult);
    }

    @Test
    void divisionTest(){
        var actualResult = calculator.division(5, 0);
        Assertions.assertEquals(2.5, actualResult);
    }
    @Test
    void assertsTesting(){
        Assertions.assertNotSame(calculator, calculatorAnother);
//        Assertions.assertSame(calculator, calculatorAnother);
    }

    @Test
    public void additionTestWithArrayEquals() {
        int[] expectedArray = {4};
        int[] actualArray = {calculator.addition(2, 3)};
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }


}
