package discountStrategy;

public class FlatDiscountStrategy implements DiscountStrategy{


@Override
public double applyDiscount(Order order) {
    return order.getTotalAmount() - (order.getTotalAmount()*0.2);
}
}
