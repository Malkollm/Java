/**
 * Created by Марсель on 08.03.2016.
 */
public class Metods {
    public static void pr() { //переход на новую строку
        System.out.println();
    }
    public static void pr(double d) {
        if((int)d == d) { //Попытка отбросить дробную часть
            System.out.print((int)d); //выводим число
        } else {
            System.out.print(d); //выводим дробь
        }
    }
    public static void pr(double[] m) {
        pr(m, "/ "); //выводит массив и слеш
    }
    public static void pr(double[] m, String s) {
        for(int i = 0; i < m.length; i++) {
            pr(m[i]); //вызывает 3й метод и передает массив
            System.out.print(s); //выводит пробел
        }
    }
    public static void main(String[] args) {
        double[] arrn = {1, 2.71, 3.14, 15, -5, 92, 0.5};
        double p = 3.0;
        int k = 13;
        pr(p); // вывод числа, без дробной части при возможности
        pr(); // переводит строку
        pr(arrn); // вывод числового массива в строку
        pr(); // переводит строку
        pr(arrn,", "); // вывод числового массива в строку через запятую
        pr(); // переводит строку
        pr(k); // вывод целого числа через автоприведение
    }
}

