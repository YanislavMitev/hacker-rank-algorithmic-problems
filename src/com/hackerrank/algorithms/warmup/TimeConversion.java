package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] stringSplit = s.split(":");
        String hours = stringSplit[0];
        String suffix = stringSplit[stringSplit.length - 1];

        int hoursToInt = Integer.parseInt(hours);
        String appendix = "";

        if (suffix.endsWith("PM")) {
            if (hoursToInt < 12) {
                hours = "" + (hoursToInt + 12);
            }
        } else {
            if (hoursToInt > 11) {
                if (hoursToInt < 22) {
                    appendix = "0";
                }
                hours = "" + appendix + (hoursToInt - 12);
            }
        }

        stringSplit[0] = hours;
        suffix = suffix.substring(0,2);
        stringSplit[stringSplit.length - 1] = suffix;

        return String.join(":", stringSplit);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    }
}
