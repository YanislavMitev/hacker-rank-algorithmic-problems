package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class CatsAndAMouse {
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int mouseADistance = Math.abs(x - z);
        int mouseBDistance = Math.abs(y - z);

        if (mouseADistance == mouseBDistance) {
            return "Mouse C";
        }

        if (mouseADistance > mouseBDistance) {
            return "Cat B";
        } else {
            return "Cat A";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println(catAndMouse(x, y, z));

        scanner.close();
    }
}
