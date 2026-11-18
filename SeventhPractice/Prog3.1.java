package SeventhPractice;

import SeventhPractice.Contacts.Contact;
import SeventhPractice.Contacts.PhoneBook;

public class Prog3 {

    public static void main(String[] args) {
        Contact vasyaContact = new Contact("Вася", "+79315778191");
        Contact petyaContact = new Contact("Петя", "+79315778190");
        Contact kolyaContact = new Contact("Коля", "+79315778293");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContactToGroup("Работа", vasyaContact);
        phoneBook.addContactToGroup("Работа", vasyaContact);
        phoneBook.addContactToGroup("Работа", kolyaContact);
        phoneBook.addContactToGroup("Работа", petyaContact);
        phoneBook.addContactToGroup("Учеба", petyaContact);
        phoneBook.addContactToGroup("Учеба", vasyaContact);
        phoneBook.addContactToGroup("Дом", kolyaContact);
        phoneBook.addContactToGroup("Дом", vasyaContact);

        System.out.println(phoneBook);
        System.out.println(phoneBook.findContactsByGroup("Работа"));
        System.out.println(phoneBook.findContacByTelephone("+79315778191"));
    }
}
