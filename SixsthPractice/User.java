package SixsthPractice;

public class User {
    private final String login;
    private final String password;
    private final String email;
    private final int age;

    public User(String login, String email, String password, int age) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public int getAge() {
        return this.age;
    }
}
