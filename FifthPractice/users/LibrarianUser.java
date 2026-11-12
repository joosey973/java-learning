package FifthPractice.users;

import FifthPractice.roles.Librarian;
import FifthPractice.roles.Supplier;

public class LibrarianUser extends User implements Librarian {
    public LibrarianUser(String name) { super(name); }

    @Override
    public void orderBook(String bookTitle, Supplier supplier) {
        System.out.println("Библиотекарь " + name + " заказал у поставщика " + supplier.getName() + " книгу \"" + bookTitle + "\"");
        supplier.bringBook(bookTitle, this);
    }
}