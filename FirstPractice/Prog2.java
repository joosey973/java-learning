package FirstPractice;
import FirstPractice.methods.MathMethods;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        int peopleCount;
        double diameter;

        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Введите количество человек на дне рождения:");
        peopleCount = scannerIn.nextInt();
        System.out.println("Введите диаметр торта:");
        diameter = scannerIn.nextDouble();

        System.out.println("Площадь одного куска торта = " + section(peopleCount, diameter));

        scannerIn.close();
    }

    public static double section(int peopleCount, double diameter) {
        double alpha = 360.0 / peopleCount;
        double S = Math.PI * MathMethods.pow(diameter, 2) * alpha / (360 * 4);
        return S;
    }

}
