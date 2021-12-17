package test.lesson1;

/*Создать массив на 5 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLesson1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];

       for (int x = 0; x < num.length; x++) {
           num[x] = Integer.parseInt(br.readLine());
       }

       int min = num[0];
       int max = num[0];

       for (int x = 1; x < num.length; x++){
           if(num[x] < min){
               min = num[x];
           }
           if(num[x] > max){
               max = num[x];
           }
       }

       System.out.println(max + " " + min);
    }
}
