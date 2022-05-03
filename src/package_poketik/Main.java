package package_poketik;

public class Main {
    public static void main(String[] args) {
        User ivan = new User("ivan@mail.ru", "ivan");
        User valid = new User("valid@mail.ru", "valid");
        User yaroslav = new User("yaroslav@mail.ru", "yaroslav");

        MailService service = new MailService();
        MessageAttributes message0 = new MessageAttributes(ivan, yaroslav, "Текст Здарова, Ярик!", "За кашу манную, за жизнь туманную");
        MessageAttributes message1 = new MessageAttributes(yaroslav, ivan, "Дргое сообщение, получается", "Другая тема");
        MessageAttributes message2 = new MessageAttributes(valid, yaroslav, "Привет, Ярик!", "Другая тема для Ярика");

        service.sendMessage(message0);
        service.sendMessage(message1);
        service.sendMessage(message2);
        service.receiveMessage("yaroslav@mail.ru");
    }
}