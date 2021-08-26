package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class SaveThePrisoner {
    public static int saveThePrisoner(int prisoners, int treats, int startFrom) {
        // Write your code here
        int result = (treats + startFrom - 1) % prisoners;

        return result != 0 ? result : prisoners;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prisoners = scanner.nextInt();
        int treats = scanner.nextInt();
        int startFrom = scanner.nextInt();

        System.out.println(SaveThePrisoner.saveThePrisoner(prisoners, treats, startFrom));
    }
}
