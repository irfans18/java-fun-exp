package com.rfms.string_manipulation;

public class Main {
    public static void main(String[] args) {
        rusak(1000);
    }
    public static void rusak(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1 ; i <= n ; i++) {
            System.out.println("Hello");
        }

        rusak((int)n/2);
    }
}