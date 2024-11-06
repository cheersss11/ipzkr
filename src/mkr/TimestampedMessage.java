package mkr;


public class TimestampedMessage extends MessageDecorator {

    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "[Timestamp: 06.11.24 11:45] " + message.getContent();
    }
}

