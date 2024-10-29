package dependencyInversion.section2;

public class Notification {

    private final Message message;

    //Dependency Injection
    public  Notification(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        message.sendMessage();
    }


}
