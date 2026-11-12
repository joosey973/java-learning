package FifthPractice.users;

import FifthPractice.roles.Administrator;
import FifthPractice.roles.Librarian;
import FifthPractice.roles.Reader;
import FifthPractice.roles.Supplier;

public class SupplierReader extends User implements Supplier, Reader {
    public SupplierReader(String name) { super(name); }

    @Override
    public void bringBook(String bookTitle, Librarian librarian) {
        System.out.println("Поставщик " + name + " принес книгу \"" + bookTitle + "\" библиотекарю " + librarian.getName());
    }

    @Override
    public void takeBook(String bookTitle, Administrator admin) {
        System.out.println("Читатель-поставщик " + name + " берет книгу \"" + bookTitle + "\" у администратора " + admin.getName());
        admin.findAndGiveBook(bookTitle, this);
    }

    @Override
    public void returnBook(String bookTitle, Administrator admin) {
        System.out.println("Читатель-поставщик " + name + " возвращает книгу \"" + bookTitle + "\" администратору " + admin.getName());
    }
}