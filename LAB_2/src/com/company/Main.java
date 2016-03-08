package com.company;

/**
   * 03.02.16
   * Фаткуллин Марсель;
   * Вывод четных чисел в диапазоне [1;100];
 */
public class Main {

    public static void main(String[] args) {
        try { //попробовать выполнить
            int i = 0;
            while (i < 100) {
                i += 2;
                System.out.print(i + " ");
            }
        }
        catch(Exception e){ //отловить ошибку
            System.out.println("Ошибка");
            }
        }
    }
