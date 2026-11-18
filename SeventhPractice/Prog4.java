package SeventhPractice;

import java.util.HashSet;
import java.util.Set;

import SeventhPractice.Students.Student;
import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Set<Student> studentsSet = new HashSet<>();

        Scanner scannerIn = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            String[] stringLine = scannerIn.nextLine().trim().split(", ");
            if (stringLine[0].equals("end")) {
                flag = false;
            } else {
                Student student = new Student(stringLine[0], stringLine[1], stringLine[2]);
                if (studentsSet.contains(student)) {
                    System.out.println("Студент уже добавлен!");
                } else {
                    studentsSet.add(student);
                }
            }
        }

        System.out.println("Список студентов:");
        for (Student student: studentsSet) {
            System.out.printf("- %s, %s, %s%n", student.name, student.group, student.studentId);
        }
    }
}
