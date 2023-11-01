package ecommerce;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new PayPal(), new EmailNotifier());

        List<Item> items = new ArrayList<>();
        Item shoes = new Item(50);
        Item top = new Item(10);
        items.add(shoes);
        items.add(top);

        Order order = new Order(items);

        orderProcessor.processOrder(order);
    }
}