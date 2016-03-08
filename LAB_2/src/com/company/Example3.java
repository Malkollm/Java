package com.company;

//Библиотеки пакетов Java
import java.io.*;
import java.io.InputStreamReader;

/**
   * 03.02.16
   * Фаткуллин Марсель;
   * Рисуем прямоугольный треугольник из 8;
 */
public class Example3 {

    public static void main (String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //создаем объект класса Example3
        //System.in - объект, стандартный поток ввода(клавиатура)

        //переменные
        String m;
        int m1=0;

        //Считываем данные с клавиатуры
        try { //попробовать выполнить
            m = in.readLine(); //читаем строку с клавиатуры
            m1 = Integer.parseInt(m); //преобразовываем строку в число.
        } catch (IOException e) { //отловить ошибку
            System.out.println("Ошибка");
        }

        //Основная программа
        for(int i=1; i<m1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
