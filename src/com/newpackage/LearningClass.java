package com.newpackage;

import java.util.Scanner;

public class LearningClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin;

        System.out.println("Для рассчета квадратного уравнения введите 1. ");
        System.out.println("Для выхода из программы введите 0. ");

        begin= sc.nextInt();

        if (begin == 1){
            for (; ;) {
                diskr(sc);
                System.out.println("Продолжить? - (Y/N) ");
                String contin = sc.next();

                if (contin.equals("N")) {
                    break;
                }
            }
        }

        else if (begin == 0) {
            System.out.println("Программа завершена");
        }

        else {
            System.out.println("Некорректная команда. Попробуйте еще раз.");
        }
    }

    public static void diskr(Scanner scanner){
        
        double a, b, c, d, x1, x2;
        System.out.print("Введите число a: "); //
        a = scanner.nextDouble();//
        System.out.print("Введите число b: ");//
        b = scanner.nextDouble();//
        System.out.print("Введите число c: ");//
        c = scanner.nextDouble();//

        d = Math.sqrt(b * b - 4 * a * c);//
        System.out.println("");//
        System.out.format("Квадратный корень из дискриминанта равен: %.2f%n", d);//
        x1 = (-b - d) / 2 * a;//
        System.out.format("x1 = %.1f%n", x1);//
        x2 = (-b + d) / 2 * a;//
        System.out.format("x2 = %.1f%n", x2);//
        System.out.println("");//
        System.out.println("Квадратное уравнение: ");//
        System.out.println(a + "x^2 + " + b + "x + " + c);//
        System.out.println("");//

    };
}
