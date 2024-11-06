package mkr;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("повідомлення");

        message = new EncryptedMessage(message);
        System.out.println("Після шифрування: " + message.getContent());

        message = new TimestampedMessage(message);
        System.out.println("Після додавання дати і часу: " + message.getContent());

        message = new CompressedMessage(message);
        System.out.println("Після стиснення: " + message.getContent());

        message = new AuthorMessage(message);
        System.out.println("Після додавання імені автора: " + message.getContent());
    }
}