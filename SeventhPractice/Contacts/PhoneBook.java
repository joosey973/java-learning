package SeventhPractice.Contacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public HashMap<String, List<Contact>> contactsGroups = new HashMap<>();

    public void addContactToGroup(String groupName, Contact contact) {
        List<Contact> group = this.contactsGroups.get(groupName);
        if (group == null) {
            group = new ArrayList<>();
            this.contactsGroups.put(groupName, group);
        }

        if (group.contains(contact)) {
            System.out.println("Контакт уже добавлен в группу!");
            return;
        }

        group.add(contact);
    }

    public List<Contact> findContactsByGroup(String groupName) {
        return this.contactsGroups.get(groupName);
    }

    public Contact findContacByTelephone(String telephone) {
        for (List<Contact> contactsList: this.contactsGroups.values()) {
            for (Contact userContact: contactsList) {
                if (userContact.telephone.equals(telephone)) {
                    return userContact;
                }
            }
        }

        return new Contact();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Телефонная книга:\n");
        for (Map.Entry<String, List<Contact>> entry: this.contactsGroups.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
