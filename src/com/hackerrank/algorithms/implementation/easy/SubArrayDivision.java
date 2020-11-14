package com.hackerrank.algorithms.implementation.easy;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SubArrayDivision {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int sumOfSubArrays = 0;

        for (int index = 0; index < s.size() - (m - 1); index++) {
            int subSum = 0;
            for (int index2 = index; index2 < index + m; index2++) {
                subSum += s.get(index2);
            }
            if (subSum == d) {
                sumOfSubArrays++;
            }
        }

        return sumOfSubArrays;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        System.out.println(birthday(s, d, m));

        bufferedReader.close();
    }
}
