import java.util.Scanner;
/**
 * Created by Марсель on 08.06.2016.
 */
public class Circle {
    public int x; // абсцисса центра
    public int y; // ордината центра


    double length_circle(double R){
        double pi = Math.PI;
        double l = 2 * pi * R;

       return l;
    }

    //Движение центра окружности
    public void moveCircle(int a, int b) {
        //int a = (int) (Math.random()*99-99);
        //int b = (int) (Math.random()*99-99);
        x = x + a;
        y = y + b;
    }

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+")");
    }

    public static void main(String[] args) {
        int k=0;
        int l=0;
        Scanner scanner = new Scanner(System.in);
        Circle obj = new Circle();
        if (scanner.hasNextInt()) {
            k = scanner.NextInt();

        }
        System.out.println("Длина окружности " + obj.length_circle(5.2));
        obj.moveCircle();
        obj.printCircle();
    }
}
