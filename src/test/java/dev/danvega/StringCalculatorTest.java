package dev.danvega;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    @Test
    void shouldAddTwotStringNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("3,1");
        assertEquals(4, sum);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        int difference = stringCalculator.subtract("3,2");
        assertEquals(1, difference);
    }
}