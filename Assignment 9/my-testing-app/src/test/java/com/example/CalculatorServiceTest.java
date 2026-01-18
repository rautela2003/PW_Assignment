package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    void testAddNumbers() {
        CalculatorService service = new CalculatorService();
        assertEquals(10, service.addNumbers(4, 6));
    }
}
