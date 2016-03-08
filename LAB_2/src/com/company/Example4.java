package com.company;

import java.io.*;
import java.io.InputStreamReader;

/**
   * 03.02.16
   * Фаткуллин Марсель;
   * Находим минимальное из двух чисел;
 */
public class Example4 {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //создаем объект класса Example4
        //System.in - объект, стандартный поток ввода(клавиатура)

        //переменные
        String m,n;
        int m1=0, n1=0;

        //Считываем данные с клавиатуры
        try { //попробовать выполнить
            m = in.readLine(); //читаем строку с клавиатуры
            m1 = Integer.parseInt(m); //преобразовываем строку в число.
        } catch (IOException e) { //отловить ошибку
            System.out.println("Ошибка");
        }
        try {
            n = in.readLine(); //читаем строку с клавиатуры
            n1= Integer.parseInt(n); //преобразовываем строку в число.
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        //Основная программа
        if (m1<n1){
            System.out.println("min = " + m1);
        } else {
            System.out.println("min = " + n1);
        }
    }
}
