package SecondPractice;

import java.util.Locale;
import java.util.Scanner;

public class Prog3 {
    public static final String productsList[] = {"Молоко", "Хлеб", "Гречневая крупа"};
    public static final int pricesList[] = {50, 14, 80};
    public static int productsCountList[] = {0, 0, 0};
    public static int productsSum = 0;

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in).useLocale(Locale.US);
        taskLogic(scannerIn);
        scannerIn.close();
    }

    public static void printOptions() {
        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < productsList.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n", i + 1, productsList[i], pricesList[i]);
        }
        System.out.println("end - выйти из программы");
        System.out.print("Введите номер товара и количество (через один пробел) или выйдите из программы: ");
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
            String productAndCount = scannerIn.nextLine().trim();
            System.out.println();
            String[] productCountList = productAndCount.split(" ");
            if (productCountList.length < 2 && productCountList.length > 0 && !productCountList[0].equals("end")) {
                System.out.println("Не введено количество товаров!\n");
                continue;
            } else if (productCountList.length > 3) {
                System.out.println("Не корректно введены данные!\n");
                continue;
            }

            String productNum = productCountList[0];

             if (isInteger(productNum)) {
                int productNumInt = Integer.parseInt(productNum);
                String productCount = productCountList[1];
                if (!isInteger(productCount)) {
                    System.out.println("Некорректный формат количества товаров!\n");
                    continue;
                }
                
                int productCountInt = Integer.parseInt(productCount);
                if (productNumInt > productsList.length || productNumInt <= 0) {
                    System.out.println("Нет продукта с таким номером!\n");
                } else {
                    productsCountList[productNumInt - 1] += productCountInt;
                }
             } else if (productNum.equals("end")) {
                printBasket();
                break;
             } else {
                System.out.println("Оперция не распознана\n");
             }
        }
    }

    public static void printBasket() {
        System.out.println("Ваша корзина:");
        System.out.printf("%-25s %-15s %-15s %s\n", "Наименование товара", "Количество", "Цена/за ед.", "Общая стоимость");
        for (int i = 0; i < productsList.length; i++) {
            if (productsCountList[i] != 0) {
                int tempSum = productsCountList[i] * pricesList[i];
                productsSum += tempSum;
                System.out.printf("%-25s %-15d %-15d %d\n", productsList[i], productsCountList[i], pricesList[i], tempSum);
            }
        }
        System.out.println("Итого: " + productsSum);
    }
}
