package com.hackerrank.algorithms.implementation.easy;

import java.util.*;

public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        Map<Character, Integer> alphabet = new HashMap<>(initializeAlphabetMap());

        int tallestWord = -1;

        for (int index = 0; index < word.length(); index++) {
            int alphabetIndex = alphabet.get(word.charAt(index));

            if (h.get(alphabetIndex) > tallestWord) {
                tallestWord = h.get(alphabetIndex);
            }
        }

        return tallestWord * word.length();
    }

    private static Map<Character, Integer> initializeAlphabetMap() {
        Map<Character, Integer> alphabet = new HashMap<>();

        alphabet.put('a', 0);  alphabet.put('b', 1);  alphabet.put('c', 2);  alphabet.put('d', 3);
        alphabet.put('e', 4);  alphabet.put('f', 5);  alphabet.put('g', 6);  alphabet.put('h', 7);
        alphabet.put('i', 8);  alphabet.put('j', 9);  alphabet.put('k', 10); alphabet.put('l', 11);
        alphabet.put('m', 12); alphabet.put('n', 13); alphabet.put('o', 14); alphabet.put('p', 15);
        alphabet.put('q', 16); alphabet.put('r', 17); alphabet.put('s', 18); alphabet.put('t', 19);
        alphabet.put('u', 20); alphabet.put('v', 21); alphabet.put('w', 22); alphabet.put('x', 23);
        alphabet.put('y', 24); alphabet.put('z', 25);

        return alphabet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> h = new ArrayList<>();

        for(int letter = 0; letter < 26; letter++) {
            h.add(scanner.nextInt());
        }
        scanner.nextLine();

        String word = scanner.nextLine();

        System.out.println(DesignerPDFViewer.designerPdfViewer(h, word.toLowerCase()));

        scanner.close();
    }
}
