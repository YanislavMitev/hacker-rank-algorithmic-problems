package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        boolean isJulian = year < 1918;

        boolean isLeap = isJulian ?
                         year % 4 == 0 :
                         year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        if (year != 1918) {
            if (isLeap) {
                return "12.09." + year;
            } else {
                return "13.09" + year;
            }
        } else {
            return "26.09." + year;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        System.out.println(dayOfProgrammer(year));

        scanner.close();
    }
}
