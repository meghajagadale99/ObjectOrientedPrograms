package com.bridgelabz.oops;

import java.util.Random;
import java.util.Scanner;

public class OOPsUtility {
    static Scanner scanner = new Scanner(System.in);

    public static int integerScanner() {
        return scanner.nextInt();
    }

    public static String stringScanner() {
        return scanner.next();
    }


    public static String[] shuffleCardsDeck(String[] arr) {
        Random random = new Random();
        int f1, f2;
        String temp;
        for (int i = 0; i < 52; i++) {
            f1 = random.nextInt(51);
            f2 = random.nextInt(51);
            if (f1 != f2) {
                temp = arr[f1];
                arr[f1] = arr[f2];
                arr[f2] = temp;
            }
        }
        return arr;

    }

    public static int calculateTotalValueOfStock(int numberOfShares, int sharePrice) {
        return numberOfShares * sharePrice;
    }



}
