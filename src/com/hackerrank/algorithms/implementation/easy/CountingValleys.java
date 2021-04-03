package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleysCount = 0;
        int seaLevel = 0;
        boolean isValley = false;

        for (int index = 0; index < path.length(); index++) {
            if (path.charAt(index) == 'U') {
                seaLevel++;

                if (seaLevel == 0) {
                    isValley = false;
                    valleysCount++;
                }
            } else {
                seaLevel--;

                if (seaLevel == 0) {
                    isValley = true;
                }
            }
        }

        return valleysCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = scanner.nextInt();

        String path = "";

        while (path.trim().isEmpty()) {
            path = scanner.nextLine();
        }

        System.out.println(countingValleys(steps, path));
        scanner.close();
    }
}
