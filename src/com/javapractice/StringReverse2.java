package com.javapractice;

public class StringReverse2 {
    public static void main(String[] args) {
        checkPolindrome("ajith");

    }

    public static void checkPolindrome(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        if (input.equals(output)) {
            System.out.println("Polindrome");
        } else
            System.out.println("not a Polindrome");
    }
}
