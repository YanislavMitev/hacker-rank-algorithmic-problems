package com.hackerrank.algorithms.implementation.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesByMatch {
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int index = 0; index < ar.length; index++) {
            int sockCount = countMap.get(ar[index]) == null ? 0 : countMap.get(ar[index]);

            countMap.put(ar[index], ++sockCount);
        }

        for (int value : countMap.values()) {
            if (value == 0) {
                continue;
            }

            if (value % 2 == 0) {
                pairs += value / 2;
            } else {
                pairs += (value - 1) / 2;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Socks number");
        int socksNumber = scanner.nextInt();

        int[] socksArray = new int[socksNumber];

        for (int index = 0; index < socksNumber; index++) {
            socksArray[index] = scanner.nextInt();
        }

        System.out.println(sockMerchant(socksNumber, socksArray));
        scanner.close();
    }
}
