package com.mosley.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CurrencyTest {
    @Test
    void testCurrency() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(new Dollar(10), product);
        product = dollar.times(3);
        assertNotEquals(new Dollar(15), product);
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }
}
