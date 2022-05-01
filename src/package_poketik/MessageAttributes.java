package package_poketik;

public class MessageAttributes {
    private final User sender;
    private final User recipient;
    private final String message;
    private final String letterSubject;

    //Конструктор
    public MessageAttributes(User sender, User recipient, String message, String letterSubject) {
        this.recipient = recipient;
        this.sender = sender;
        this.message = message;
        this.letterSubject = letterSubject;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public String getLetterSubject() {
        return letterSubject;
    }
}

