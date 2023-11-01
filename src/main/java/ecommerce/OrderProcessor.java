package ecommerce;

import notificationService.Notifier;

public class OrderProcessor {
    private PaymentProcessor paymentProcessor;
    private UserOrderNotifier notifier;

    public OrderProcessor(PaymentProcessor paymentProcessor, UserOrderNotifier notifier) {
        this.paymentProcessor = paymentProcessor;
        this.notifier = notifier;
    }

    public void processOrder(Order order) {
        paymentProcessor.processPayment(order.calculateTotal());
        notifier.notifyUserOrderConfirmed(order.getTotal());
    }
}
