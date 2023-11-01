package discountStrategy;

public class SeasonalDiscountStrategy implements DiscountStrategy{

    double discountRate = 0.1;

    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public double applyDiscount(Order order) {
        return order.getTotalAmount() - (order.getTotalAmount()*0.1);
    }
}
