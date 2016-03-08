package com.company;

/**
 * 22.02.16
 * Фаткуллин Марсель
 * Двумерный массив из 7 строк и 4 столбцов [-5;5]
 * Вывести индекс строки с наибольшим по модулю произведением элементов
 */
public class Example5 {
    public static void main(String[] args) {
        int count = 0; //
        int n = 0; //Для вывода индекса строки
        //Двумерный массив 7 строк и 4 столбца
        int[][] arr = new int[7][4];
        int count1 = 1; //Необходим для перемножения элементов массива
        //в каждой строке

        System.out.println("Массив");
        //sout внутри цикла для перехода на новую строку
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                //Массиву присваиваются рандомные числа через функцию
                arr[i][j] = (int) (Math.random() * 11) - 5;
                count1 *= arr[i][j]; //Перемножаем элементы
                //Выводим массив
                System.out.format(" " + arr[i][j] + " ");
            }
            //если произведение по модулю больше чем 0 то
            //присваиваем
            if (Math.abs(count1) > count) {
                count = count1;
                n = i;
            }
        }
        System.out.println("");
        System.out.println("Строка: " + n);
    }
}

