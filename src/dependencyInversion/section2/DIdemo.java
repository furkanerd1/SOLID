package dependencyInversion.section2;

public class DIdemo {
    public static void main(String[] args) {
        Notification theNotification = new Notification(new Sms());
        theNotification.sendMessage();
    }
}
