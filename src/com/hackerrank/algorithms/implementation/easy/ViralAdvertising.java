package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class ViralAdvertising {
    public static int viralAdvertising(int days) {
        // Write your code here
        int shares = 5;
        int cumulativeLikes = 0;

        for (int day = 1; day <= days; day++) {
            int half = shares / 2;
            cumulativeLikes += half;
            shares = half * 3;
        }

        return cumulativeLikes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        System.out.println(ViralAdvertising.viralAdvertising(days));
    }
}
