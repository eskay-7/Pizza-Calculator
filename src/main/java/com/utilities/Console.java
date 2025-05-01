package com.utilities;

import java.util.Scanner;

public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static int readNumber(String promptMessage, int min, int max) {
        int data = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print(promptMessage);
            if (scanner.hasNextInt()) {
                data = scanner.nextInt();
                isValidInput = checkIfWithinRange(data, min, max);
            } else {
                System.out.println("ERROR, enter a whole number");
                scanner.next();//use this to eat the invalid input in the scanner stream
            }
        }
        return data;
    }

    public static String readString(String promptMessage) {
        System.out.print(promptMessage);
        String data = scanner.next();
        return data;
    }

    public static String readLine(String promptMessage) {
        System.out.print(promptMessage);
        String data = scanner.nextLine();
        System.out.println();
        return data;
    }

    private static boolean checkIfWithinRange(int data, int min, int max) {
        if (data < min || data > max) {
            System.out.printf("ERROR, INPUT A VALUE BETWEEN %d and %d\n", min, max);
            return false;
        }
        return true;
    }
}
