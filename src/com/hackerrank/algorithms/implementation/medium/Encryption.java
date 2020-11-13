package com.hackerrank.algorithms.implementation.medium;

import java.util.Scanner;

public class Encryption {
    // Complete the encryption function below.
    static String encryption(String s) {
        int stringLength = s.length();
        int rows = (int) Math.floor(Math.sqrt(stringLength));
        int columns = (int) Math.ceil(Math.sqrt(stringLength));

        if (rows*columns < stringLength) {
            if (rows < columns) {
                rows++;
            } else {
                columns++;
            }
        }

        char[][] encryptionMatrix = new char[rows][columns];
        int stringIndex = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns && stringIndex < stringLength; column++) {
                encryptionMatrix[row][column] = s.charAt(stringIndex++);
            }
        }

        StringBuilder encryptedString = new StringBuilder();

        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < rows; row++) {
                if (encryptionMatrix[row][col] != 0) {
                    encryptedString.append(encryptionMatrix[row][col]);
                }
            }

            encryptedString.append(' ');
        }

        return encryptedString.toString().trim();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        String result = encryption(s);

        System.out.println(result);

        scanner.close();
    }
}
