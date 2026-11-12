package FifthPractice.users;

import FifthPractice.roles.Librarian;
import FifthPractice.roles.Supplier;

public class SupplierUser extends User implements Supplier {
    public SupplierUser(String name) { super(name); }

    @Override
    public void bringBook(String bookTitle, Librarian librarian) {
        System.out.println("Поставщик " + name + " принес книгу \"" + bookTitle + "\" библиотекарю " + librarian.getName());
    }
}