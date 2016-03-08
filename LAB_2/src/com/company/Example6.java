package com.company;

import java.io.*;

/**
 * 03.02.16
 * Фаткуллин Марсель;
 * Функция вычисляющая минимум из 4-х чисел
 */
public class Example6 {

    public static int min(int a, int b){

        return a < b ? a : b;
    } //метод условного выражения для нахождения минимума м/у 2-мя числами

    public static int min4(int a, int b, int c, int d) {

        return min(a, min(b, min(c, d)));
    } //метод

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));

        String w,x,y,z;
        int w1=0,x1=0,y1=0,z1=0;

            //Считываем данные с клавиатуры
            try { //попробовать выполнить
                w = in.readLine(); //читаем строку с клавиатуры
                w1 = Integer.parseInt(w); //преобразовываем строку в число.
            } catch (IOException e) { //отловить ошибку
                System.out.println("Ошибка");
            }
            try {
                x = in.readLine();
                x1 = Integer.parseInt(x); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
            try {
                y = in.readLine();
                y1 = Integer.parseInt(y); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
            try {
                z = in.readLine();
                z1 = Integer.parseInt(z); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
        //Тело программы
        System.out.print("min: ");
        //System.out.println(min4(w1,x1,y1,z1));
        System.out.println(min(min(w1,x1),min(y1,z1)));
    }
}
