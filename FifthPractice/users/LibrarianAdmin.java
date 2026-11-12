package FifthPractice.users;

import FifthPractice.roles.Administrator;
import FifthPractice.roles.Librarian;
import FifthPractice.roles.Reader;
import FifthPractice.roles.Supplier;

public class LibrarianAdmin extends User implements Librarian, Administrator {
    public LibrarianAdmin(String name) { super(name); }

    @Override
    public void orderBook(String bookTitle, Supplier supplier) {
        System.out.println("Библиотекарь " + name + " заказал у поставщика " + supplier.getName() + " книгу \"" + bookTitle + "\"");
        supplier.bringBook(bookTitle, this);
    }

    @Override
    public void findAndGiveBook(String bookTitle, Reader reader) {
        System.out.println("Администратор " + name + " нашел и выдал книгу \"" + bookTitle + "\" читателю " + reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " уведомил читателя " + reader.getName() + " о просрочке возврата книги");
    }
}