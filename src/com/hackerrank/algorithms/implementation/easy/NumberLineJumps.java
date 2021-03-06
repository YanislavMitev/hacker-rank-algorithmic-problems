package com.hackerrank.algorithms.implementation.easy;

import java.io.IOException;
import java.util.Scanner;

public class NumberLineJumps {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 < x2 && v2 > v1) {
            return "NO";
        }

        int firstCangarooStep = x1 + v1;
        int secondCangarooStep = x2 + v2;

        while (firstCangarooStep <= secondCangarooStep) {
            if (firstCangarooStep == secondCangarooStep) return "YES";

            firstCangarooStep += v1;
            secondCangarooStep += v2;
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
        scanner.close();
    }
}
