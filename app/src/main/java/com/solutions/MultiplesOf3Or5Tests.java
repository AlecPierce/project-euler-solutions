package com.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplesOf3Or5Tests {

    @Test
    public void testSumOfMultiplesBelow10() {
        assertInstanceOf(Integer.class, MultiplesOf3Or5.findSumOfMultiples(10));
    }

    @Test
    public void testSumOfMultiplesBelow20() {
        assertEquals(543, MultiplesOf3Or5.findSumOfMultiples(49));
    }

    @Test
    public void testSumOfMultiplesBelow1000() {
        assertEquals(233168, MultiplesOf3Or5.findSumOfMultiples(1000));
    }

    @Test
    public void testSumOfMultiplesBelow8456() {
        assertEquals(16687353, MultiplesOf3Or5.findSumOfMultiples(8456));
    }

    @Test
    public void testSumOfMultiplesBelow19564() {
        assertEquals(89301183, MultiplesOf3Or5.findSumOfMultiples(19564));
    }
}