package notificationService;

public class InitialEmailNotifier implements Notifier {

    public void send(String message) {
        System.out.println("Email sent.");
    }
}
