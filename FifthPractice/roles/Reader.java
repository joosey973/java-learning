package FifthPractice.roles;

public interface Reader {
    String getName();
    void takeBook(String bookTitle, Administrator admin);
    void returnBook(String bookTitle, Administrator admin);
}