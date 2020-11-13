package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long minSum = 0;
        long maxSum = 0;

        Arrays.sort(arr);

        for (int index = 0; index < arr.length - 1; index++) {
            minSum += arr[index];
        }

        for (int index = arr.length - 1; index > 0; index--) {
            maxSum += arr[index];
        }

        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
