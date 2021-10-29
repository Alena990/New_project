package com.newpackage;

import java.util.Scanner;

public class LearningClass {
    //int a; // static это переменная класса и сразу инициализируются

    public static void main(String[] args) {
        double a, b, c, d, x1, x2;

        Scanner num = new Scanner(System.in);
        for (; ;) {
            System.out.println("Для выхода из программы введите -1 ");
            System.out.print("Введите число a: ");
            a = num.nextDouble();
            if (a == -1) {
                    break;
                }
            System.out.print("Введите число b: ");
            b = num.nextDouble();
            if (b == -1) {
                    break;
                }
            System.out.print("Введите число c: ");
            c = num.nextDouble();
            if (c == -1) {
                    break;
                }

            d = Math.sqrt(b * b - 4 * a * c);
            System.out.println("");
            System.out.format("Квадратный корень из дискриминанта равен: %.2f%n", d);
            x1 = (-b - d) / 2 * a;
            System.out.format("x1 = %.1f%n", x1);
            x2 = (-b + d) / 2 * a;
            System.out.format("x2 = %.1f%n", x2);
            System.out.println("");
            System.out.println("Квадратное уравнение: ");
            System.out.println(a + "x^2 + " + b + "x + " + c);
            System.out.println("");


        }



    }
}
