package dev.danvega.legacy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    void shouldAddTwoStringNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1,2");
        Assertions.assertEquals(3, sum);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        int difference = stringCalculator.subtract("3,2");
        Assertions.assertEquals(1, difference);
    }

}
