package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;


/**
 * <a href="https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true">
 *     Link to hackerrank problem:
 * </a>
 */
public class AppendAndDelete {
    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        int indexOfDeviation = 0;

        if (t.contains(s) && s.length() != t.length()) {
            indexOfDeviation = s.length();
        }

        for (int index = 0; index < s.length() && indexOfDeviation == 0; index++) {
            sb.append(s.charAt(index));

            if (!t.startsWith(sb.toString())) {
                indexOfDeviation = index;
                break;
            }
        }

        if (indexOfDeviation == 0) {
            if (k >= s.length() * 2) {
                return "Yes";
            }

            return "No";
        }

        int elementsToDelete = s.length() - indexOfDeviation;
        int elementsToAdd = t.length() - indexOfDeviation;

        if ((elementsToAdd + elementsToDelete) <= k) {
            if (k > s.length() && t.length() > s.length()) {
                return "No";
            }

            return "Yes";
        }


        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();

        System.out.println(appendAndDelete(s, t, k));
    }
}
