package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true">
 *     Link to hackerrank problem:
 * </a>
 */
public class SherlockAndSquares {
    public static int squares(int a, int b) {
        // Write your code here

        int intSquares = 0;

        for (int number = 1; number <= b; number++) {
            int square = number * number;

            if (square > b) {
                break;
            }

            if (square >= a) {
                intSquares++;
            }
        }

        return intSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = SherlockAndSquares.squares(a, b);

        System.out.println(result);

        scanner.close();
    }
}
