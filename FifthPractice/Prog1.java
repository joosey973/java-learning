package FifthPractice;

import FifthPractice.users.*;

public class Prog1 {
    public static void main(String[] args) {

        LibrarianUser tolya = new LibrarianUser("Толя");
        SupplierUser petya  = new SupplierUser("Петя");
        AdministratorUser olya = new AdministratorUser("Оля");
        ReaderUser sasha = new ReaderUser("Саша");

        tolya.orderBook("Игра Престолов", petya);
        sasha.takeBook("Игра Престолов", olya);
        olya.overdueNotification(sasha);
        sasha.returnBook("Игра Престолов", olya);

        System.out.println();

        LibrarianAdmin vlad = new LibrarianAdmin("Влад");
        SupplierReader kostya = new SupplierReader("Костя");
        UniversalUser anna = new UniversalUser("Анна");

        vlad.orderBook("Гарри Поттер", kostya);
        kostya.takeBook("Гарри Поттер", anna);
        anna.orderBook("Хоббит", kostya);
        anna.overdueNotification(kostya);
        vlad.overdueNotification(kostya);
        kostya.returnBook("Гарри Поттер", anna);
    }
}