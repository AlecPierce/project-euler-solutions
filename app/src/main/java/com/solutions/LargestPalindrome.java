package com.solutions;

/**
 * Problem 4: Largest palindrome product
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two n-digit numbers.
 */
public class LargestPalindrome {
    public static void main(String[] args) {
        int n = 3; // You can change this number as needed
        System.out.println("Largest palindrome product of " + n + " digit numbers is: " + findLargestPalindrome(n));
    }

    public static int findLargestPalindrome(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int min = (int) Math.pow(10, n - 1);
        int maxPalindrome = 0;
        for (int i = max; i >= min; i--) {
            for (int j = i; j >= min; j--) {
                int product = i * j;
                if (product < maxPalindrome) {
                    break;
                }
                if (isPalindrome(product)) {
                    maxPalindrome = product;
                }
            }
        }
        return maxPalindrome;
    }

    public static boolean isPalindrome(int n) {
        int reversed = 0;
        int original = n;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
}
