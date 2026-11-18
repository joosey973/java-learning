package SeventhPractice.Contacts;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    public Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String telephone) {
        LocalDateTime currentTime = LocalDateTime.now();
        while (missedCalls.containsKey(currentTime)) {
            currentTime = currentTime.plusNanos(1);
        }

        missedCalls.put(currentTime, telephone);
    }

    public void printMissedCalls(PhoneBook phoneBook) {
        System.out.println("Пропущенные вызовы:");
        if (missedCalls.isEmpty()) {
            System.out.println("Нет пропущенных вызовов!");
            return;
        }

        for (Map.Entry<LocalDateTime, String> entry: missedCalls.entrySet()) {
            Contact contact = phoneBook.findContacByTelephone(entry.getValue());
            System.out.printf("%s - %s%n", entry.getKey(), contact.name == null ? entry.getValue() : contact.name);
        }
    }
}
