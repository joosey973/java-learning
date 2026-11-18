package SeventhPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Prog1 {
    public static void showOptions() {
        System.out.println();
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");

    }
    public static void main(String[] args) {
        ArrayList<String> tasksList = new ArrayList<>();
        int optionVariant;
        
        Scanner scannerIn = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            showOptions();

            try {
                optionVariant = scannerIn.nextInt();
                scannerIn.nextLine(); 
            } catch (Exception e) {
                scannerIn.nextLine(); 
                continue;
            }

            switch (optionVariant) {
                case 1 -> {
                    System.out.println("Введите задачу для планирования: ");
                    String task = scannerIn.nextLine().trim();
                    if (!task.isEmpty()) tasksList.add(task);
                }
                case 2 -> {
                    System.out.println();
                    for (int i = 0; i < tasksList.size(); i++) {
                        System.out.printf("%d. %s%n", i + 1, tasksList.get(i));
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Введите номер задачи для удаления: ");
                    int taskNum = scannerIn.nextInt();
                    scannerIn.nextLine();
                    if (taskNum < 0 || taskNum > tasksList.size()) {
                        break;
                    }

                    tasksList.remove(taskNum - 1);
                }
                case 4 -> {
                    flag = false;
                }
            }
        }

        scannerIn.close();

    }    
}
