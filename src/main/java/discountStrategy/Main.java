package discountStrategy;

public class Main {
    public static void main (String []args){
        Order order = new Order(100);
        order.setDiscountStrategy(new FlatDiscountStrategy());
        System.out.println(order.applyDiscount());

        order.setDiscountStrategy(new SeasonalDiscountStrategy());
        System.out.println(order.applyDiscount());

    }
}
