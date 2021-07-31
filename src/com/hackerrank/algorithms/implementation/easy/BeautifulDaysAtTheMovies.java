package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int startingDayNumber, int endingDayNumber, int divisor) {
        int beautifulDays = 0;

        for (int day = startingDayNumber; day <= endingDayNumber; day++) {
            int reversedDay = reverseDay(day);
            double calculation = (double) Math.abs(day - reversedDay) / divisor;

            if (calculation % 1 == 0) {
                beautifulDays++;
            }
        }

        return beautifulDays;
    }

    private static int reverseDay(int day) {
        int reversedNumber = 0;

        while(day > 0) {
            int remainder = day % 10;
            day /= 10;

            reversedNumber = (reversedNumber + remainder);

            if (day > 0) {
                reversedNumber *= 10;
            }
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingDayNumber = scanner.nextInt();

        int endingDayNumber = scanner.nextInt();

        int divisor = scanner.nextInt();

        System.out.println(BeautifulDaysAtTheMovies.beautifulDays(startingDayNumber, endingDayNumber, divisor));

        scanner.close();
    }
}
