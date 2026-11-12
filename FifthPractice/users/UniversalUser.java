package FifthPractice.users;

import FifthPractice.roles.Administrator;
import FifthPractice.roles.Librarian;
import FifthPractice.roles.Reader;
import FifthPractice.roles.Supplier;

public class UniversalUser extends User implements Reader, Librarian, Administrator {
    public UniversalUser(String name) { super(name); }

    @Override
    public void takeBook(String bookTitle, Administrator admin) {
        System.out.println("Универсал " + name + " (как читатель) берет книгу \"" + bookTitle + "\" у администратора " + admin.getName());
        admin.findAndGiveBook(bookTitle, this);
    }

    @Override
    public void returnBook(String bookTitle, Administrator admin) {
        System.out.println("Универсал " + name + " (как читатель) возвращает книгу \"" + bookTitle + "\" администратору " + admin.getName());
    }

    @Override
    public void orderBook(String bookTitle, Supplier supplier) {
        System.out.println("Универсал " + name + " (как библиотекарь) заказал у поставщика " + supplier.getName() + " книгу \"" + bookTitle + "\"");
        supplier.bringBook(bookTitle, this);
    }

    @Override
    public void findAndGiveBook(String bookTitle, Reader reader) {
        System.out.println("Универсал " + name + " (как администратор) нашел и выдал книгу \"" + bookTitle + "\" читателю " + reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Универсал " + name + " (как администратор) уведомил читателя " + reader.getName() + " о просрочке");
    }
}