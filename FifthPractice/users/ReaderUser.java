package FifthPractice.users;

import FifthPractice.roles.Administrator;
import FifthPractice.roles.Reader;

public class ReaderUser extends User implements Reader {
    public ReaderUser(String name) { super(name); }

    @Override
    public void takeBook(String bookTitle, Administrator admin) {
        System.out.println("Читатель " + name + " берет книгу \"" + bookTitle + "\" у администратора " + admin.getName());
        admin.findAndGiveBook(bookTitle, this);
    }

    @Override
    public void returnBook(String bookTitle, Administrator admin) {
        System.out.println("Читатель " + name + " возвращает книгу \"" + bookTitle + "\" администратору " + admin.getName());
    }
}