package org.example;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTestPositive {
    Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Test
    void additionTest(){
        var actualResult = calculator.addition(4, 5);
        Assertions.assertEquals(9, actualResult);
    }

    @Test
    void substractionTest(){
        var actualResult = calculator.substraction(5, 2);
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void multiplicationTest(){
        var actualResult = calculator.multiplication(4, 5);
        Assertions.assertEquals(20, actualResult);
    }

    @Test
    void divisionTest(){
        var actualResult = calculator.division(5, 2);
        Assertions.assertEquals(2.5, actualResult);
    }

    //boundry condition
    @Test
    void boundryTest() {
        Assertions.assertEquals(Integer.MAX_VALUE, calculator.division(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testDivision_AssertThat() {
        assertThat(calculator.division(15, 5), Matchers.is(Matchers.equalTo(3.0)));
    }


}
