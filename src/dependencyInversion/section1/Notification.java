package dependencyInversion.section1;

public class Notification {
    public void sender(NotificationType notificationType) {
        if (notificationType == NotificationType.SMS) {
            new Sms().sendSms();
        } else if (notificationType == NotificationType.EMAIL) {
            new Email().sendEmail();
        }
    }
}
