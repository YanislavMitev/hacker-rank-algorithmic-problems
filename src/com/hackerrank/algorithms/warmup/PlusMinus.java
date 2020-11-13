package com.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("#.######");
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (int element : arr) {
            if (element > 0) {
                positives++;
            } else {
                if (element < 0) {
                    negatives++;
                } else zeros++;
            }
        }

        System.out.println(df.format(positives / arr.length));
        System.out.println(df.format(negatives / arr.length));
        System.out.println(df.format(zeros / arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
