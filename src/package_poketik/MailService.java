package package_poketik;

public class MailService {
    MessageAttributes[] posts = new MessageAttributes[3];

    public void sendMessage(MessageAttributes messageAttributes) {
        int i;
        boolean recorded = false;

        for (i = 0; i < posts.length; i++) {
            if (posts[i] == null) {
                posts[i] = messageAttributes;
                recorded = true;
                System.out.println("Сообщение отправлено на почту: " + posts[i].getRecipient().getEmailAddress());
                break;
            }
        }
        if (!recorded) {
            System.out.println("Сообщение не было отправлено. Не хватает места.");
        }
        System.out.println("-----------------------------");
    }

    public void receiveMessage(String recipientEmail) {
        int i;
        MessageAttributes a;
        boolean empty = true;
        for (i = 0; i < posts.length; i++) {
            if (posts[i] != null && posts[i].getRecipient().getEmailAddress() == recipientEmail) {
                System.out.println("Отправитель: " + posts[i].getSender().getUserName() + " - [" + posts[i].getSender().getEmailAddress() + "]");
                System.out.println("Тема письма: " + posts[i].getLetterSubject());
                System.out.println("Сообщение: " + posts[i].getMessage());
                System.out.println("-----------------------------");
                empty = false;
            }
        }
        if (empty) {
            System.out.println("В ящике нет сообщений.");
        }
    }
}