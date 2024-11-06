package mkr;

public class AuthorMessage extends MessageDecorator {

    public AuthorMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return message.getContent() + " - Автор: Андрій Савченко";
    }
}