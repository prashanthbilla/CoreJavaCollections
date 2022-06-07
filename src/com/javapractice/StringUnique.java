package com.javapractice;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringUnique {

    public static void main(String[] args) {
        tryMessage();
        String input = "interview";
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            unique.add(input.charAt(i));
        }
        System.out.println(unique.stream().sorted().collect(Collectors.toList()));
    }

    public static void tryMessage() {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            try {
                System.out.println("Inner Try ..........");
                throw new Exception();
            } catch (Exception exception) {
                System.out.println("Inner Catch execution ....");
            }
        }
    }
}
