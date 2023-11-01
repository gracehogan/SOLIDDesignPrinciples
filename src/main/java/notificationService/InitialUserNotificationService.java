package notificationService;

public class InitialUserNotificationService {
    private Notifier notifier;

    public InitialUserNotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.send(message);
    }
}
