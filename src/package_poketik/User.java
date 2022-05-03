package package_poketik;

public class User {
    private final String emailAddress;
    private final String userName;

    //Конструктор
    public User(String emailAddress, String userName) {
        this.emailAddress = emailAddress;
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserName() {
        return userName;
    }
}