package com.hackerrank.algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        /*  birdId,  amount **/
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int bird : arr) {
            Integer amountOfBirds = countMap.get(bird);
            if (amountOfBirds == null) {
                countMap.put(bird, 1);
            } else {
                countMap.put(bird, ++amountOfBirds);
            }
        }

        Supplier<Comparator<Map.Entry<Integer, Integer>>> compareByValue = Map.Entry::comparingByValue;

        int max = countMap.entrySet().stream()
                                     .max(compareByValue.get())
                                     .orElseThrow(IllegalArgumentException::new)
                                     .getValue();

        return countMap.entrySet().stream()
                                  .filter(entry -> entry.getValue() == max)
                                  .findFirst()
                                  .orElseThrow(IllegalArgumentException::new)
                                  .getKey();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(migratoryBirds(arr));

        bufferedReader.close();
    }
}
