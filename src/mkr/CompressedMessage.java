package mkr;


public class CompressedMessage extends MessageDecorator {

    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "[Compressed] " + message.getContent();
    }
}
