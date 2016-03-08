package com.company;

/**
 * 10.02.16
 * Фаткуллин Марсель
 * Массив нечетных чисел [1;99] прямой и обратный порядок
 */
public class Example2 {
    public static void main(String[] args) {
        //Инициализация массива arr размерностью 100
        int[] arr = new int[50];
        int k = 0;
        int l = 0;

        //В прямом порядке
        for (int i = 1; i < 100; i += 2) {
            arr[k] = i;
            System.out.print(arr[k] + " ");
        }
        //Переход на новую строку
        System.out.println("\n");
        //В обратном порядке
        for (int j = 100-1; j > 0; j -= 2) {
            arr[l]=j;
            System.out.print(arr[l] + " ");
        }
    }
}
