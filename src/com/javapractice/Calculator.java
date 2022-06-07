package com.javapractice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    Double a, b;
    Double result;
    ArrayList<String> al;

    public void input() {
        al = new ArrayList<>();
        System.out.println("================================");
        System.out.println(" WELCOME TO THE NEW CALCULATOR");
        System.out.println("================================");
        firstNumber();
    }

    public void firstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a First Number    =  ");
        try {
            a = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println(" You Should enter Numeric Values because this is a Calculator, 0K....");
            firstNumber();
        }
        secondNumber();
    }

    public void secondNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(" Enter a Second Number   =  ");
            b = scanner.nextDouble();
            if (b > 0) {
                selectOperation();
            } else {
                System.out.println(" Error(leads to reach value INFINITE), Please enter Second Number other than '0' ");
                secondNumber();
            }
        } catch (InputMismatchException exception) {
            System.out.println(" You Should enter Numeric Values because this is a Calculator, 0K....");
            secondNumber();
        }
    }

    public void selectOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Please select the operation among these --> '+'  '-'  '*'  '/'  '%'  ---->  ");
        char g = scanner.next().charAt(0);
        System.out.println("---------------------------------------------------------------------------------");
        switch (g) {
            case '+':
                add();
                doMore();
                break;
            case '-':
                sub();
                doMore();
                break;
            case '*':
                multiplication();
                doMore();
                break;
            case '/':
                division();
                doMore();
                break;
            case '%':
                percentage();
                doMore();
                break;
            default:
                System.out.println(" You entered wrong option --->");
                selectOperation();
                break;
        }
    }

    public void add() {
        result = a + b;
        System.out.println("First Number  = " + a);
        System.out.println("Second Number = " + b);
        System.out.println("-------------------------");
        System.out.println("       (A+B)  = " + result);
        System.out.println("-------------------------");
        String s = "  Addition        --> A + B =  " + result;
        String t = addToList(s);
        System.out.println(t);
    }

    public void sub() {
        result = a - b;
        System.out.println("First Number  = " + a);
        System.out.println("Second Number = " + b);
        System.out.println("-------------------------");
        System.out.println("       (A-B)  = " + result);
        System.out.println("-------------------------");
        String s = " Subtraction     --> A - B =  " + result;
        String t = addToList(s);
        System.out.println(t);
        if (b > a) {
            System.out.println(" You got the negative number, cuase: B > A  ");
        }
    }

    public void multiplication() {
        result = a * b;
        System.out.println("First Number  = " + a);
        System.out.println("Second Number = " + b);
        System.out.println("-------------------------");
        System.out.println("       (A*B)  = " + result);
        System.out.println("-------------------------");
        String s = " Multiplication  --> A * B =  " + result;
        String t = addToList(s);
        System.out.println(t);
    }

    public void division() {
        result = a / b;
        System.out.println("First Number  = " + a);
        System.out.println("Second Number = " + b);
        System.out.println("--------------------------------");
        System.out.println("       (A/B)  = " + result);
        System.out.println("--------------------------------");
        String s = " Division        --> A / B =  " + result;
        String t = addToList(s);
        System.out.println(t);
    }

    public void percentage() {
        result = (a * 100) / b;
        System.out.println("First Number              = " + a);
        System.out.println("Second Number             = " + b);
        System.out.println("-----------------------------------------");
        System.out.println(" A percentage of B   (%)  = " + result);
        System.out.println("-----------------------------------------");
        String s = " Percentage      --> A % B =  " + result;
        String t = addToList(s);
        System.out.println(t);
    }

    public void doMore() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please select ---> '@' = DO MORE OPERATIONS <---> '#' = STATUS <---> '$' = EXIT <---> '!' = CLEAR AND START NEW ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '@':
                selectOperation();
            case '#':
                status();
            case '$':
                System.exit(0);
            case '!':
                input();
            default:
                System.out.println("You have entered the wrong option please choose below one");
                doMore();
        }
    }

    public String addToList(String s) {
        al.add(s + "\n");
        return "Updated";
    }

    public void status() {
        System.out.println("------------------------------------------");
        System.out.println("         STATUS OF ALL OPERATIONS ");
        System.out.println("------------------------------------------");
        System.out.println(al);
        doMore();
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.input();
    }
}
