package com.company;

//Библиотеки пакетов Java
import java.io.*;
import java.io.InputStreamReader;

/**
   * 03.02.16
   * Фаткуллин Марсель;
   * Рисуем прямоугольник из цифры 8;
 */
public class Example2 {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //создаем объект класса Example2
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
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                System.out.print(8);
            }
            System.out.println(8);
        }





    }





}
