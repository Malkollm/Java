package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
   * 03.02.16
   * Фаткуллин Марсель;
   * Проверка координат на четверть;
 */
public class Example7 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //создаем объект класса Example7
        //System.in - объект, стандартный поток ввода(клавиатура)

        //m1 - абцисс
        //n1 - ординат
        String m,n;
        int m1=0,n1=0;

        System.out.println("Введите X и Y");

        //Считываем данные с клавиатуры
        try { //попробовать выполнить
            m = in.readLine(); //читаем строку с клавиатуры
            n = in.readLine();
                m1 = Integer.parseInt(m); //преобразовываем строку в число.
                n1 = Integer.parseInt(n);
        } catch (Exception e){ //отловить ошибку
            System.out.println("Ошибка");
        }

        //Основная программа
        if ((m1 >= 0) && (n1 >= 0)) {
            System.out.println("1 четверть");
        }
        if ((m1 <= 0) && (n1 >= 0)) {
            System.out.println("2 четверть");
        }
        if ((m1 <= 0) && (n1 <= 0)) {
            System.out.println("3 четверть");
        }
        if ((m1 >= 0) && (n1 <= 0)) {
            System.out.println("4 четверть");
        }
    }
}
