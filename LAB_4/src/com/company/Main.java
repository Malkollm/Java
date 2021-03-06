package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Марсель on 08.03.2016.
 * Вывести через метод целочисленный массив и рандомное целое число диапазона [1;4]
 */
public class Main {

    public static int rand_numb(int a, int b) {
        Random random = new Random();
        //с = от 1 до 4 (рандомно)
        int c = a + random.nextInt(b);
        return c;
    }

    public static int[] rand_mass(int a, int b) {
        //а и b диапазон чисел, c рандомное целое число
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            //массив = от 1 до 4 (рандомно)
            array[i] = a + random.nextInt(b);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("\n Массив выведенный через метод: " + Arrays.toString(rand_mass(1, 4)));
        System.out.println("\n Выводим число: " + rand_numb(1, 4));
    }
}
