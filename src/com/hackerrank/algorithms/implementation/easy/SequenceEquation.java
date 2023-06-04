package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/permutation-equation/problem">
 *     Link to hackerrank problem:
 * </a>
 */
public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> integers) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (int x = 1; x <= integers.size(); x++) {
            int index = integers.indexOf(x) + 1;
            int y = integers.indexOf(index) + 1;

            if (x == integers.get(integers.get(y - 1) - 1)) {
                result.add(y);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> p = new ArrayList<>();
        int n = scanner.nextInt();

        for (int index = 0; index < n; index++) {
            p.add(scanner.nextInt());
        }

        List<Integer> result = SequenceEquation.permutationEquation(p);

        System.out.println(result);
        scanner.close();
    }
}
