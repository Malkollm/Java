package com.company;

/**
 * 21.02.16
 * Фаткуллин Марсель
 * Двумерный массив из 8 строк и 5 столбцов [10;99]
 */
public class Example4 {
    public static void main(String[] args) {
        //Двумерный массив 8 строк и 5 столбцов
        int[][] arr = new int[8][5];

        //Создаем псевдорандомные числа
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10); //[10;99]
            }
        }
        //Вывод массива
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0){
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(" " + "-" + " ");
                }
            }
        }
    }
}

