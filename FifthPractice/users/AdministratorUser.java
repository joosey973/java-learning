package FifthPractice.users;

import FifthPractice.roles.Administrator;
import FifthPractice.roles.Reader;

public class AdministratorUser extends User implements Administrator {
    public AdministratorUser(String name) { super(name); }

    @Override
    public void findAndGiveBook(String bookTitle, Reader reader) {
        System.out.println("Администратор " + name + " нашел и выдал книгу \"" + bookTitle + "\" читателю " + reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " уведомил читателя " + reader.getName() + " о просрочке возврата книги");
    }
}