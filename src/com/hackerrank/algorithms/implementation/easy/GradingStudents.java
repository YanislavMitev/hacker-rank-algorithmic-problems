package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class GradingStudents {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int gradeIndex = 0; gradeIndex < grades.size(); gradeIndex++) {
            int grade = grades.get(gradeIndex);
            int nextMultipleOfFive = ((grade/10)*10) + 5;

            if ((grade % 5) != 0 && grade > 37) {
                if (grade > nextMultipleOfFive) {
                    nextMultipleOfFive += 5;
                }

                if ((nextMultipleOfFive - grade) < 3) {
                    grades.set(gradeIndex, nextMultipleOfFive);
                }
            }
        }

        return grades;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradesCount = scanner.nextInt();

        List<Integer> grades = new ArrayList<>();
        while (gradesCount-- > 0) {
            grades.add(scanner.nextInt());
        }

        List<Integer> result = GradingStudents.gradingStudents(grades);
        result.forEach(System.out::println);

        scanner.close();
    }
}
