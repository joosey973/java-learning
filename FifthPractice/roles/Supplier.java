package FifthPractice.roles;

public interface Supplier {
    String getName();
    void bringBook(String bookTitle, Librarian librarian);
}