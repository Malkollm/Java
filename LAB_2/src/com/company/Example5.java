package com.company;

import java.io.*;
import java.io.InputStreamReader;

/**
   * 03.02.16
   * Фаткуллин Марсель;
   * Проверка введеного имени на идентичность и длину;
 */
public class Example5 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //создаем объект класса Example5
        //System.in - объект, стандартный поток ввода(клавиатура)

        //переменные
        String name1 = "", name2 = "";

        //Считываем данные с клавиатуры
        try { //попробовать выполнить
            name1 = in.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) { //отловить ошибку
            System.out.println("Ошибка");
        }
        try {
            name2 = in.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        //Основная программа
        //(!name1.matches("^\\D*$") - проверка введеной строки на цифры и на пустое значение
        if ((!name1.matches("^\\D*$")) || (!name2.matches("^\\D*$"))) {
            System.out.println("В имени есть числа");
        } else {
            if (name1.equalsIgnoreCase(name2)) {
                System.out.println("Имена идентичны");
            } else {
                if (name1.length() == name2.length()) {
                    System.out.println("Длины имен равны");
                } else {
                    if (name1.length() != name2.length()){
                        System.out.println("Имена разные");
                        System.out.println("Длина имен разная");
                    }
                }
            }
        }
    }
}
