package com.hackerrank.algorithms.implementation.easy;

import java.util.*;

public class PickingNumbers {
    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    /**
     * Идеята на задачата е да се намери най-дългият
     * подмасив от 2 различни елемента (ако подмасивът ни е 4, 5, 6, 3, 3
     * ще изберем {4, 3, 3}, защото са 2 различни числа -> 4 и 3,
     * а не {4, 5, 3, 3}, защото това са 3 числа -> 3, 4, 5), чиято абсолютна
     * сума е <= 1.
     *
     * @param a is the list of integer values to create the sub-array from.
     */
    public static int pickingNumbers(List<Integer> a) {
        int[] countingSortArray = new int[100];

        for (int element : a) {
            ++countingSortArray[element];
        }

        int maxSubarray = 0;

        for (int current = 0; current < countingSortArray.length - 1; current++) {
            for (int next = current + 1; next < countingSortArray.length; next++) {
                if (Math.abs(current - next) <= 1) {
                    int temp = countingSortArray[current] + countingSortArray[next];

                    maxSubarray = Math.max(temp, maxSubarray);
                }
            }
        }

        return maxSubarray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println(pickingNumbers(numbers));

        scanner.close();
    }
}
