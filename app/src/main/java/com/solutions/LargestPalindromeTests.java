package com.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPalindromeTests {

    @Test
    void testReturnNumber() {
        assertInstanceOf(Integer.class, LargestPalindrome.findLargestPalindrome(2));
    }

    @Test
    void testFindLargestPalindrome2() {
        assertEquals(9009, LargestPalindrome.findLargestPalindrome(2));
    }

    @Test
    void testFindLargestPalindrome3() {
        assertEquals(906609, LargestPalindrome.findLargestPalindrome(3));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(LargestPalindrome.isPalindrome(8008));
    }
}