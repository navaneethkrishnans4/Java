package com.jap;
import java.util.Scanner;
public class CheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Name:");
        String s = scanner.nextLine();
        try {
            checkStringLength(s);
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void checkStringLength(String str) throws StringLengthException {
        if (str.length() > 8) {
            throw new StringLengthException("Name length is more than 8");
        }
    }
}
