package ecommerce;

public class TextNotifier implements UserOrderNotifier {
    @Override
    public void notifyUserOrderConfirmed(double total) {
        System.out.println("Text confirmation. Your total is: " + total);
    }
}