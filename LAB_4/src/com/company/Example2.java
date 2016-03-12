package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Марсель on 11.03.2016.
 * Вывести через метод предыдущей задачи 5 массивов
 */
public class Example2 {

    //выводит массив 1
    public static int[] Output_result(int[]array){
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(15);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0; //используется в цикле для вывода 5и массивов
        Output_result(arr); //вывод 1 массива
        while (i<5){ //вывод 5и массивов заполненных в  предыдущей задаче
            System.out.println("Массив " + Arrays.toString(Main.rand_mass(1,3))); //обращение к классу Main и методу rand_numb
            i++;
        }
    }
}
