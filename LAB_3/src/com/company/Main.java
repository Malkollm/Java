package com.company;

/**
 * 10.02.16
 * Фаткуллин Марсель
 * Массив четных чисел [0;20] по горизонтали и вертикали
 */
public class Main {
    public static void main(String[] args) {
        //Инициализация массива arr размерностью 10
        int[] arr = new int[10];
        int j = 0;
        int k = 0;

        //По горизонтали
        for (int i = 1; i <= 20; i++) {
            if ((i % 2) == 0) {
                arr[j] = i;
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        //По вертикали
        for (int l = 1; l <= 20; l++) {
            if ((l % 2) == 0) {
                arr[k] = l;
                System.out.println("" + arr[k]);
            }
        }
    }
}
