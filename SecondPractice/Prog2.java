package SecondPractice;

import SecondPractice.methods.MathMethods;
import java.util.Locale;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in).useLocale(Locale.US);
        taskLogic(scannerIn);
        scannerIn.close();
    }

    public static void printOptions() {
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");
        System.out.println("end - выйти из программы");
    }

    public static boolean isInteger(String value) {
        try {
            Integer.valueOf(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void taskLogic(Scanner scannerIn) {
        while (true) { 
            printOptions();
            String answer = scannerIn.nextLine().trim();
            if (isInteger(answer)) {
                int answerInt = Integer.parseInt(answer);
                switch (answerInt) {
                    case 1 -> {
                        compareNum(scannerIn);
                    }
                    case 2 -> {
                        roundNum(scannerIn);
                    }
                    case 3 -> {
                        truncateNum(scannerIn);
                    }
                    default -> System.out.println("Введена некорректная опция\n");
                }
            }
            else if (answer.equals("end")) {
                break;
            } else {
                System.out.println("Оперция не распознана\n");
            }

        }
    }

    public static void compareNum(Scanner scannerIn) {
        System.out.print("Введите первое число: ");
        double firstNum = scannerIn.nextDouble();
        System.out.print("Введите второе число: ");
        float secondNum = scannerIn.nextFloat();
        scannerIn.nextLine();

        double eps = 1e-6;
        if (MathMethods.abs(firstNum - secondNum) < eps) {
            System.out.println("Числа равны!\n");
        } else if (firstNum > secondNum) {
            System.out.println("Первое число больше второго!\n");
        } else {
            System.out.println("Второе число больше первого!\n");
        }
    }

    public static void roundNum(Scanner scannerIn) {
        System.out.print("Введите число: ");
        double num = scannerIn.nextDouble();
        scannerIn.nextLine();
        long truncated = (long) num;
        double frac = num - truncated;

        if (frac >= 0.5) truncated++;
        if (frac < -0.5) truncated--;

        System.out.println("Округленное число: " + truncated + "\n");
    }

    public static void truncateNum(Scanner scannerIn) {
        System.out.print("Введите число: ");
        double num = scannerIn.nextDouble();
        scannerIn.nextLine();
        System.out.println("Число с отброшенной дробной частью: " + (int)num + "\n");
    }
}
