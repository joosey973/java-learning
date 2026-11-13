package SixsthPractice;

import SixsthPractice.exceptions.UserAccessDeniedException;
import SixsthPractice.exceptions.UserNotFoundException;
import java.util.Scanner;

public class Prog1 {
    public static User[] getUsers() {
        User user1 = new User("vasya", "vasya@gmail.com", "1234", 14);
        User user2 = new User("petya", "petya@gmail.com", "1234", 18);
        User user3 = new User("kolya", "kolya@gmail.com", "1234", 25);
        return new User[] {user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = Prog1.getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;           
            }
        }

        throw new UserNotFoundException("Пользователь не найден!");
    }

    public static void validateUser(User user) throws UserAccessDeniedException {
        if (user.getAge() < 18) throw new UserAccessDeniedException("Доступ запрещен!");
    }

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scannerIn.nextLine().trim();
        System.out.print("Введите пароль: ");
        String password = scannerIn.nextLine().trim();
        try {
            User user = Prog1.getUserByLoginAndPassword(login, password);
            validateUser(user);
            System.out.println("Доступ предоставлен");
        } catch (UserAccessDeniedException | UserNotFoundException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        } finally {
            scannerIn.close();
        }

    }
}
