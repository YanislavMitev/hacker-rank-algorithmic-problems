package com.hackerrank.algorithms.implementation.easy;

import java.util.*;

public class ElectronicsShop {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        /*
         * Write your code here.
         *
         * Example:
         * -------------------------
         * keyboards  = [40, 50, 60]
         * usb drives = [5,  8,  20]
         * max        = 58
         */
        int max = -1;

        for(int index = 0; index < keyboards.length; index++) {
            for (int index1 = 0; index1 < drives.length; index1++) {
                int currentMax = keyboards[index] + drives[index1];

                if (currentMax == budget) {
                    return currentMax;
                }

                if (currentMax > max && currentMax <= budget) {
                    max = currentMax;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = scanner.nextInt();

        int numberOfKeyboards = scanner.nextInt();

        int numberOfUSBDrives = scanner.nextInt();

        int[] keyboards = new int[numberOfKeyboards];

        for (int keyboardsItr = 0; keyboardsItr < numberOfKeyboards; keyboardsItr++) {
            keyboards[keyboardsItr] = scanner.nextInt();
        }

        int[] drives = new int[numberOfUSBDrives];

        for (int drivesItr = 0; drivesItr < numberOfUSBDrives; drivesItr++) {
            drives[drivesItr] = scanner.nextInt();
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        System.out.println(getMoneySpent(keyboards, drives, budget));

        scanner.close();
    }
}
