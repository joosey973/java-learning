package SeventhPractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        int floor;
        Deque<String> queue = new ArrayDeque<>(); 
        boolean flag = true;

        Scanner scannerIn = new Scanner(System.in);
        while (flag) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            floor = scannerIn.nextInt();
            if (floor == 0) {
                flag = false;
            } else if (queue.peekLast() != null && queue.peekLast().equals("этаж " + String.valueOf(floor))) {
                System.out.println("Лифт приедет на этот этаж!");
                continue;
            }
            queue.add("этаж " + String.valueOf(floor));
            
        }

        System.out.println(String.join(" -> ", queue));
        scannerIn.close();
    }
}
