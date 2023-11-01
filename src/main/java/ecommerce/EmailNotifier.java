package ecommerce;

public class EmailNotifier implements UserOrderNotifier {
    @Override
    public void notifyUserOrderConfirmed(double total) {
        System.out.println("Email confirmation. Your total is: " + total);
    }
}
