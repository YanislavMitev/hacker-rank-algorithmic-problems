package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class UtopianTree {
    public static int utopianTree(int cycles) {
        int initialSablingSize = 1;

        for (int cycle = 0; cycle < cycles; cycle++) {
            if (cycle % 2 == 0) {
                initialSablingSize *= 2;
            } else {
                initialSablingSize++;
            }
        }

        return initialSablingSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int testCase = 0; testCase < testCases; testCase++) {
            int cycles = scanner.nextInt();

            System.out.println(UtopianTree.utopianTree(cycles));
        }

        scanner.close();
    }
}
