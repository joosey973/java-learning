package ThirdPractice;

public class User {
    public String name;
    public String surname;
    public String email;

    public static long totalOnline = 0;

    public User() {
        name = "Unknown";
        surname = "Unknown";
        email = "Unknown@gmail.com";
        totalOnline++;
    }

    public User(String userName, String userSurname, String userEmail) {
        name = userName;
        surname = userSurname;
        email = userEmail;
        totalOnline++;
    }

    @Override 
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Информация о пользователе:\n\n");
        stringBuilder.append("Имя: ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("Фамилия: ");
        stringBuilder.append(surname);
        stringBuilder.append("\n");
        stringBuilder.append("Почта: ");
        stringBuilder.append(email);
        stringBuilder.append("\n\n");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        User user1 = new User("Брэд", "Питт", "bradpitt@gmail.com");
        User user2 = new User("Мэттью", "Макконахи", "matthewMcConaughey@gmail.com");
        User user3 = new User("Анджелина", "Джоли", "AngelinaJolie@gmail.com");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("Количество пользователей: " + User.totalOnline);
    }
}
