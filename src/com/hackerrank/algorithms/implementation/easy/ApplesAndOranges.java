package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class ApplesAndOranges {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int numberOfApples = 0;
        int numberOfOranges = 0;

        for (int apple : apples) {
            int applePosition = a + apple;
            if (applePosition >= s && applePosition <= t) {
                numberOfApples++;
            }
        }

        for (int orange : oranges) {
            int orangePosition = b + orange;
            if (orangePosition >= s && orangePosition <= t) {
                numberOfOranges++;
            }
        }

        System.out.println(numberOfApples);
        System.out.println(numberOfOranges);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
