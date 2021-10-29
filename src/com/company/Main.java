package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(calc(6, 4, 'k'));

    }

    public static double calc(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

//        if (operator == '+') {
//            return a + b;
//        }
//        else if (operator == '-'){
//            return a - b;
//        }
//        else if (operator == '*'){
//            return a * b;
//        }
//        else{
//            return a / b;
//        }
    }


