package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class DivisibleSumPairs {
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int sumOfPairs = 0;
        for (int index = 0; index < ar.length - 1; index++) {
            for (int index2 = index + 1; index2 < ar.length; index2++) {
                int isDivisible = (ar[index] + ar[index2]) % k;
                if (isDivisible == 0) {
                    sumOfPairs++;
                }
            }
        }

        return sumOfPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println(divisibleSumPairs(n, k, ar));

        scanner.close();
    }
}
