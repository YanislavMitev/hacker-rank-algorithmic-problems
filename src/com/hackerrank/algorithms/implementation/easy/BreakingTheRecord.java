package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class BreakingTheRecord {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int currentMin = scores[0];
        int currentMax = scores[0];
        int minBreak = 0;
        int maxBreak = 0;

        for (int score = 1; score < scores.length; score++) {
            if (scores[score] > currentMax) {
                currentMax = scores[score];
                maxBreak++;
            }

            if (scores[score] < currentMin) {
                currentMin = scores[score];
                minBreak++;
            }
        }

        return new int[]{maxBreak, minBreak};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        System.out.println(result);
        scanner.close();
    }
}
