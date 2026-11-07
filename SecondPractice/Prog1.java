package SecondPractice;

import java.util.Scanner;


public class Prog1 {
    public static int income = 0;
    public static int consumption = 0;
    public static double sixPercantage = 0;
    public static double fifteenPercantage = 0;

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        taskLogic(scannerIn);
        scannerIn.close();
    }

    public static boolean isInteger(String value) {
        try {
            Integer.valueOf(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void printOptions() {
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Добавить новый доход");
        System.out.println("2. Добавить новый расход");
        System.out.println("3. Выбрать систему налогообложения");
        System.out.println("end - выйти из программы");
    }

    public static void printResultInfo(double sixPercantage, double fifteenPercantage) {
        String system = "УСН доходы";
        double diff = fifteenPercantage - sixPercantage;
        double mainPerc = sixPercantage;
        double additionalPerc = fifteenPercantage;
        
        if (sixPercantage > fifteenPercantage) {
            system = "УСН доходы минус расходы";
            diff = sixPercantage - fifteenPercantage;
            mainPerc = fifteenPercantage;
            additionalPerc = sixPercantage;
        }

        System.out.println("\nМы советуем вам " + system);
        System.out.println("Ваш налог составит: " + mainPerc);
        System.out.println("Налог по другой системе: " + additionalPerc);
        System.out.println("Экономия: " + diff + "\n");
    }

    public static void taskLogic(Scanner scannerIn) {
        while (true) { 
            printOptions();
            String answer = scannerIn.nextLine().trim();
            if (isInteger(answer)) {
                int answerInt = Integer.parseInt(answer);
                switch (answerInt) {
                    case 1 -> {
                        System.out.print("Введите доход: ");
                        income += scannerIn.nextInt();
                        scannerIn.nextLine();
                    }
                    case 2 -> {
                        System.out.print("Введите расход: ");
                        consumption += scannerIn.nextInt();
                        scannerIn.nextLine();
                    }
                    case 3 -> {
                        sixPercantage = income * 0.06;
                        fifteenPercantage = income - consumption;
                        if (fifteenPercantage < 0) {
                            fifteenPercantage = 0;
                        } else {
                            fifteenPercantage *= 0.15;
                        }

                        printResultInfo(sixPercantage, fifteenPercantage);
                    }
                    default -> System.out.println("Введена некорректная опция\n");
                }
            }
            else if (answer.equals("end")) {
                break;
            } else {
                System.out.println(answer);
                System.out.println("Оперция не распознана\n");
            }

        }
    }
}