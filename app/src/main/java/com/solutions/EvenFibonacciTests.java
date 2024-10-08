package com.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenFibonacciTests {

    @Test
    public void testSumOfEvenFibonacciReturnsNumber() {
        assertInstanceOf(Integer.class, EvenFibonacci.findSumOfEvenFibonacci(10));
    }

    @Test
    public void testSumOfEvenFibonacci10() { assertEquals(10, EvenFibonacci.findSumOfEvenFibonacci(10)); }

    @Test
    public void testSumOfEvenFibonacci34() {
        assertEquals(44, EvenFibonacci.findSumOfEvenFibonacci(34));
    }

    @Test
    public void testSumOfEvenFibonacci60() {
        assertEquals(44, EvenFibonacci.findSumOfEvenFibonacci(60));
    }

    @Test
    public void testSumOfEvenFibonacci1000() {
        assertEquals(798, EvenFibonacci.findSumOfEvenFibonacci(1000));
    }

    @Test
    public void testSumOfEvenFibonacci100000() {
        assertEquals(60696, EvenFibonacci.findSumOfEvenFibonacci(100000));
    }

    @Test
    public void testSumOfEvenFibonacci4000000() {
        assertEquals(4613732, EvenFibonacci.findSumOfEvenFibonacci(4000000));
    }

}