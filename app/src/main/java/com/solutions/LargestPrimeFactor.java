package com.solutions;

/**
 * Problem 3: Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the given number?
 * 
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L; // You can change this number as needed
        System.out.println("Largest prime factor of " + number + " is: " + findLargestPrimeFactor(number));
    }

    public static long findLargestPrimeFactor(long n) {
        long i;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                i--;
            }
        }
        return i;
    }
}
