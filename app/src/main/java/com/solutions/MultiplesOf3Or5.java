package com.solutions;

/**
 * Project Euler Solution 1
 */
public class MultiplesOf3Or5 {

    public static void main(String[] args) {
        int limit = 1000; // You can change this limit as needed
        System.out.println("Sum of multiples of 3 or 5 below " + limit + " is: " + findSumOfMultiples(limit));
    }

    public static int findSumOfMultiples(int limit) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}