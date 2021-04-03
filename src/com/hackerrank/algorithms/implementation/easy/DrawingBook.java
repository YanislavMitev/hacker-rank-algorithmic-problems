package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class DrawingBook {
    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int numberOfPages, int page) {
        if (page > numberOfPages) {
            return -1;
        }

        if (page == 0 || page == 1 || page == numberOfPages) {
            return 0;
        }

        if (page <= numberOfPages / 2) {
            if (page % 2 == 0) {
                return page / 2;
            }

            return (page - 1) / 2;
        } else {
            if (numberOfPages % 2 == 0 && page % 2 != 0) {
                return (int) Math.ceil((numberOfPages - page) / 2) + 1;
            }

            return (numberOfPages - page) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of pages");
        int numberOfPages = scanner.nextInt();

        System.out.println("Page");
        int page = scanner.nextInt();

        System.out.println(pageCount(numberOfPages, page));

        scanner.close();
    }
}
