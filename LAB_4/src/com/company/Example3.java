package com.company;

import java.util.Arrays;

/**
 * Created by fms1541b on 12.03.2016.
 * Сортировка массива пузырьком
 */
public class Example3 {
    public static void buble_sort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) { //вниз
            for (int j = 0; j < i; j++) { //вверх
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = Main.rand_mass(1, 3); //присваиваем массив из предыдущей задачи
        System.out.println("Массив " + Arrays.toString(array)); //обращение к классу Main и методу rand_numb
        buble_sort(array); //вызываем метод
        System.out.print("Отсортированно ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
