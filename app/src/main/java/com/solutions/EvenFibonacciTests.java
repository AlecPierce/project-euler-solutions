package com.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenFibonacciTests {

    @Test
    public void testSumOfEvenFibonacciBelow10() {
        assertInstanceOf(Integer.class, EvenFibonacci.findSumOfEvenFibonacci(10));
    }

    @Test
    public void testSumOfEvenFibonacciBelow20() {
        assertEquals(10, EvenFibonacci.findSumOfEvenFibonacci(20));
    }

    @Test
    public void testSumOfEvenFibonacciBelow100() {
        assertEquals(44, EvenFibonacci.findSumOfEvenFibonacci(100));
    }

    @Test
    public void testSumOfEvenFibonacciBelow1000() {
        assertEquals(798, EvenFibonacci.findSumOfEvenFibonacci(1000));
    }

    @Test
    public void testSumOfEvenFibonacciBelow10000() {
        assertEquals(3382, EvenFibonacci.findSumOfEvenFibonacci(10000));
    }
}