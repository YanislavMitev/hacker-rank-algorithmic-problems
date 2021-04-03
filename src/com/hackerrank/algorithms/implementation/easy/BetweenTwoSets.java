package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int counter = 0;

        int lowerLimit = a.get(a.size() - 1);
        int upperLimit = b.get(0);
        b.addAll(0, a);

        while (upperLimit >= lowerLimit) {
            boolean isFactor = true;

            for(int element : b) {
                if (!isFactor) {
                    break;
                }

                if (element < upperLimit) {
                    isFactor = upperLimit % element == 0;
                } else {
                    isFactor = element % upperLimit == 0;
                }
            }

            if (isFactor) {
                counter++;
            }

            --upperLimit;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First array's size:");
        int n = scanner.nextInt();

        System.out.println("Second array's size:");
        int m = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("First array's elements:");
        for (int index = 0; index < n; index++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> brr = new ArrayList<>();

        System.out.println("Second array's elements:");
        for (int index = 0; index < m; index++) {
            brr.add(scanner.nextInt());
        }

        System.out.println(getTotalX(arr, brr));

        scanner.close();
    }
}
