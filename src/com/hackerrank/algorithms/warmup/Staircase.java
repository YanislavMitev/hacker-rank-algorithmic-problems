package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
        for (int rowIndex = 1; rowIndex <= n; rowIndex++) {
            int numberOfSpaceCharacters = n - rowIndex;
            int numberOfHashtags = n - numberOfSpaceCharacters;
            StringBuilder row = new StringBuilder();

            for (int spaceCharacters = 0; spaceCharacters < numberOfSpaceCharacters; spaceCharacters++) {
                row.append(' ');
            }

            for (int hashtagCharacters = 0; hashtagCharacters < numberOfHashtags; hashtagCharacters++) {
                row.append('#');
            }

            System.out.println(row);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
