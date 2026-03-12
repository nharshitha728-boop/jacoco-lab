package com.devops.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testMultiply() {
        // This covers the remaining 4 instructions in your Calculator class
        assertEquals(25, calculator.multiply(5, 5));
    }
}