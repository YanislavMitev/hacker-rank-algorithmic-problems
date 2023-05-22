package com.hackerrank.algorithms.implementation.easy;

import java.io.IOException;
import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true">
 *     Link to hackerrank problem:
 * </a>
 */
public class JumpingOnTheClouds {
    private static final Scanner scanner = new Scanner(System.in);

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        boolean looped = false;
        int iteration = 0;

        int arrayIndex = 0;

        if (c.length == k) {
            return c[0] == 1 ?
                   energy - 3 :
                   energy - 1;
        }

        while(!looped) {
            arrayIndex = (arrayIndex + k) % c.length;

            if (iteration > 0 && arrayIndex == 0) {
                looped = true;
            }

            --energy;

            if (c[arrayIndex] == 1) {
                energy -= 2;
            }

            iteration++;
        }

        return energy;
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        System.out.println("energy: " + jumpingOnClouds(c, k));

        scanner.close();
    }

}
