package package_poketik;

public class Main {
    public static void main(String[] args) {
        User ivan = new User("ivan@mail.ru", "ivan");
        User valid = new User("valid@mail.ru", "valid");
        User yaroslav = new User("yaroslav@mail.ru", "yaroslav");

        MailService service = new MailService();
        MessageAttributes message0 = new MessageAttributes(ivan, yaroslav, "Текст сообщения.", "За кашу манную, за жизнь туманную");
        MessageAttributes message1 = new MessageAttributes(ivan, yaroslav, "Дргое сообщение, получается", "Другая тема");

        //Сообщение получает некорректный пользователь
        service.receiveMessage(message0, valid.getEmailAddress());
        System.out.println("----------------------------------------");

        //Сообщение получает корректный пользователь
        service.receiveMessage(message0, yaroslav.getEmailAddress());
    }
}