
/**
 * Created by Марсель on 08.03.2016.
 */

import java.util.Scanner;
public class Proba {
    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if(sc.hasNextInt()) { //возвращает истинну если с потока ввода можно считать целое число
            int u = sc.nextInt(); //Считывает целое число
            if(u > 0) {
                if(isPrime(u)) {
                    System.out.println("Вы ввели простое число");
                } else {
                    System.out.print("Простые делители числа: ");
                    for(int i = (int)Math.sqrt(u); i >= 2  ; i--) {
                        if(u%i == 0 && isPrime(i)) {
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели не положительное число");
            }
        } else {
            System.out.println("Вы ввели не целое число или букву");
        }
    }
}

