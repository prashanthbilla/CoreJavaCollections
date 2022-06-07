package com.javapractice;

public class StringReverse {

    public static void main(String[] args) {
        String input = "This is sample code  for interview";
        int owelCount = 0;
        int consonantCount = 0;
        int spacesCount=0;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == 'i' || input.charAt(i) == 'a' ||
                    input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                owelCount = owelCount + 1;
            }
            else if (input.charAt(i) == ' '){
                spacesCount+=1;
            }
            else {
                consonantCount = consonantCount + 1;
            }
        }
        System.out.println("owelCount = "+owelCount);
        System.out.println("consonantCount = "+consonantCount);
        System.out.println("spacesCount = "+spacesCount);

    }
}
