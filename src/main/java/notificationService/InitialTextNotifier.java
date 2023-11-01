package notificationService;

public class InitialTextNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Text sent.");
    }
}
