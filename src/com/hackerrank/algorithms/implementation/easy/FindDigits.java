package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true">
 *     Link to hackerrank problem:
 * </a>
 */
public class FindDigits {
    public static int findDigits(int n) {
        // Write your code here
        int divisors = 0;
        int copyOfN = n;

        while(copyOfN > 0) {
            int digitDivisor = copyOfN % 10;

            if (digitDivisor == 0) {
                copyOfN /= 10;

                continue;
            }

            if (n % digitDivisor == 0) {
                divisors++;
            }

            copyOfN /= 10;
        }

        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(FindDigits.findDigits(n));

        scanner.close();
    }
}
