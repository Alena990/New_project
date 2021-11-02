package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int a = 6;
        int b = 4;

        System.out.println(calc(a, b, 'k'));
        System.out.println(a);

    }

    public static double calc(double a, double b, char operator) {

        a = a + 2;
        a = a + 4;
        System.out.println(a);
        return a;
    }

    }


