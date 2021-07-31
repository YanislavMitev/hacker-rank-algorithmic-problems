package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {
    public static String angryProfessor(int threshold, List<Integer> arrivalTimes) {
        int onTimeStudents = 0;

        for (int arrivalTime : arrivalTimes) {
            if (arrivalTime <= 0) {
                onTimeStudents++;
            }
        }

        return onTimeStudents < threshold ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int testCase = 0; testCase < testCases; testCase++) {
            int students = scanner.nextInt();
            int threshold = scanner.nextInt();
            List<Integer> arrivalTimes = new ArrayList<>();

            for (int student = 0; student < students; student++) {
                arrivalTimes.add(scanner.nextInt());
            }

            System.out.println(angryProfessor(threshold, arrivalTimes));
        }

        scanner.close();
    }
}
