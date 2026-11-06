package FirstPractice;

import FirstPractice.methods.MathMethods;
import java.util.Scanner;



public class Prog1 {
    public static final double EPS = 1e-10;
    public static void main(String[] args) {
        int num, n;

        Scanner scanIn = new Scanner(System.in);
        System.out.println("Введите число, чей корень будем искать:");
        num = scanIn.nextInt();
        System.out.println("Введите степень корня:");
        n = scanIn.nextInt();

        System.out.printf("Корень степени %d от числа %d = %f", n, num, sqrt(num, n));

        scanIn.close();
    }

    public static double sqrt(int num, int n) {
        if (num < 0)  throw new IllegalArgumentException("a должно быть >= 0");
        if (n < 1)  throw new IllegalArgumentException("n должно быть >= 1");
        if (num == 0) return 0;
        double xk, xkk = 1.0;

        do {
            xk = xkk;
            xkk = 1.0 / n * ((n - 1) * xk + num / MathMethods.pow(xk, n - 1));
        } while (MathMethods.abs(xkk - xk) > EPS);
        return xkk;
    }
}