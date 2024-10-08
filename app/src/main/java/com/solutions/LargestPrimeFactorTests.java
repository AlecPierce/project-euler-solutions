package com.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestPrimeFactorTests {
    @Test
    public void testLargestPrimeFactor() {
        assertInstanceOf(Long.class, LargestPrimeFactor.findLargestPrimeFactor(2));
    }

    @Test
    public void testLargestPrimeFactor2() {
        assertEquals(2, LargestPrimeFactor.findLargestPrimeFactor(2));
    }

    @Test
    public void testLargestPrimeFactor3() {
        assertEquals(3, LargestPrimeFactor.findLargestPrimeFactor(3));
    }

    @Test
    public void testLargestPrimeFactor5() {
        assertEquals(5, LargestPrimeFactor.findLargestPrimeFactor(5));
    }

    @Test
    public void testLargestPrimeFactor7() {
        assertEquals(7, LargestPrimeFactor.findLargestPrimeFactor(7));
    }

    @Test
    public void testLargestPrimeFactor8() {
        assertEquals(2, LargestPrimeFactor.findLargestPrimeFactor(8));
    }

    @Test
    public void testLargestPrimeFactor13195() {
        assertEquals(29, LargestPrimeFactor.findLargestPrimeFactor(13195));
    }

    @Test
    public void testLargestPrimeFactor600851475143() {
        assertEquals(6857, LargestPrimeFactor.findLargestPrimeFactor(600851475143L));
    }
}