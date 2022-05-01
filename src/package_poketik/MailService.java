package package_poketik;

public class MailService {
    public void sendMessage(MessageAttributes messageAttributes) {
        System.out.println("Сообщение отправлено");
    }

    public void receiveMessage(MessageAttributes messageAttributes, String recipientEmail) {
        if (messageAttributes.getRecipient().getEmailAddress() == recipientEmail) {
            System.out.println("Отправитель: " + messageAttributes.getSender().getUserName() + " - [" + messageAttributes.getSender().getEmailAddress() + "]");
            System.out.println("Тема письма: " + messageAttributes.getLetterSubject());
            System.out.println("Сообщение: " + messageAttributes.getMessage());
        } else {
            System.out.println("Сообщение предназначено для другого пользователя");
        }
    }
}
