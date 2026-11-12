package FifthPractice.roles;

public interface Administrator {
    String getName();
    void findAndGiveBook(String bookTitle, Reader reader);
    void overdueNotification(Reader reader);
}