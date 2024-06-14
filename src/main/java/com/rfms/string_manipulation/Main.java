package com.rfms.string_manipulation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // rusak(1000);
        // System.out.println(roger(8, 8));
        String input = "pemrogramanDasarJava1";
        System.out.println(input);
        charCount(input);
        System.out.println();
        charCountUsingDict(input);
    }

    private static void rusak(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Hello");
        }

        rusak((int) n / 2);
    }

    private static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }

    private static void charCount(String text) {
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("Uppercase\t: " + upperCount);
        System.out.println("Lowercase\t: " + lowerCount);
        System.out.println("Angka\t\t: " + digitCount);
        System.out.println("Symbol\t\t: " + symbolCount);
    }

    private static void charCountUsingDict(String text) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = uppercase.toLowerCase();
        String digit = "1234567890";

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for (char c : text.toCharArray()) {
            if (uppercase.contains(String.valueOf(c))) {
                upperCount++;
            } else if (lowercase.contains(String.valueOf(c))) {
                lowerCount++;
            } else if (digit.contains(String.valueOf(c))) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("Uppercase\t: " + upperCount);
        System.out.println("Lowercase\t: " + lowerCount);
        System.out.println("Angka\t\t: " + digitCount);
        System.out.println("Symbol\t\t: " + symbolCount);
    }
}