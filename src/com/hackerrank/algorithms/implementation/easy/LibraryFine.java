package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true">
 *     Link to hackerrank problem:
 * </a>
 */
public class LibraryFine {
    public static int libraryFine(int returnDate, int returnMonth, int returnYear, int dueDate, int dueMonth, int dueYear) {
        // Write your code here
        if (returnYear < dueYear) {
            return 0;
        }

        if (returnYear > dueYear) {
            return 10_000;
        }

        if (returnMonth < dueMonth) {
            return 0;
        }

        if (returnMonth > dueMonth) {
            int difference = returnMonth - dueMonth;

            return 500 * difference;
        }

        if (returnDate > dueDate) {
            int difference = returnDate - dueDate;

            return 15 * difference;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int returnDate = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnYear = scanner.nextInt();

        int dueDate = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        System.out.println(LibraryFine.libraryFine(returnDate, returnMonth, returnYear, dueDate, dueMonth, dueYear));
        scanner.close();
    }
}
