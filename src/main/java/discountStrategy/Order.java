package discountStrategy;

public class Order {
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public double applyDiscount() {
        return discountStrategy.applyDiscount(this);
    }


}
