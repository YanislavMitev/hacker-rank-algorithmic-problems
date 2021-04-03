package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int annaDoesNotEat, int moneyAnnaToBeCharged) {
        int billOfAnna = 0;

        for (int foodIndex = 0; foodIndex < bill.size(); foodIndex++) {
            int currentPrice = bill.get(foodIndex);

            if (foodIndex != annaDoesNotEat) {
                billOfAnna += currentPrice;
            }
        }

        int overcharged = moneyAnnaToBeCharged - (billOfAnna / 2);
        if (overcharged <= 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(overcharged);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int annaDoesNotEat = scanner.nextInt();

        List<Integer> bill = new ArrayList<>();

        for (int price = 0; price < n; price++) {
            bill.add(scanner.nextInt());
        }

        int moneyAnnaToBeCharged = scanner.nextInt();

        bonAppetit(bill, annaDoesNotEat, moneyAnnaToBeCharged);

        scanner.close();
    }
}
