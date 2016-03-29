package com.company;

import java.util.Random;

/**
 * Created by Марсель on 11.03.2016.
 */
public class Example2 {

    //заполняет массивы
    public static int rand_massiv(int a) {
        //а и b диапазон чисел, c рандомное целое число
        Random random = new Random();

        int[] array = new int[10];
        System.out.println("\n Массив выведенный через метод: ");
        for (int i = 0; i < array.length; i++) {
            //массив = от 1 до 4 (рандомно)
            array[i] = random.nextInt(15);
        }
        return ;
    }

    //выводит массивы
    public static int[] Output_result(){
        Random random = new Random();

        int[] array = new int [10];
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(15);
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void main(String[] args) {

    }
}
