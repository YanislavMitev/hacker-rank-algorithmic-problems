package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {
    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        int dosesTaken = 0;

        for (int hurdleHeight : height) {
            if (hurdleHeight > k) {
                int dosesToTake = hurdleHeight - k;
                dosesTaken += dosesToTake;
                k += dosesToTake;
            }
        }

        return dosesTaken;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        List<Integer> height = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            height.add(scanner.nextInt());
        }

        System.out.println(TheHurdleRace.hurdleRace(k, height));

        scanner.close();
    }
}
