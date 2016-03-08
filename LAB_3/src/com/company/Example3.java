package com.company;

import java.util.Random;

/**
 * 10.02.16
 * Фаткуллин Марсель
 * Массив псевдослучайных целых чисел [0;9] и кол-во четных элементов
 */
public class Example3 {
    public static void main(String[] args) {
        int count=0; //Переменная для подсчета количества
        int[] arr = new int[10];

        System.out.print("arr: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 ); //[0;9]
            System.out.print(arr[i] + " ");
        }
        //Поиск четных чисел
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count+=1;
            }
        }
        System.out.println("");
        System.out.println("Количество четных " + count);
    }
}
