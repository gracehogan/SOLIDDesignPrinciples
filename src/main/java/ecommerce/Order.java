package ecommerce;

import java.util.List;

public class Order {
    private List<Item> items;
    private double total = 0;

    public Order(List<Item> items) {
        this.items = items;
    }

    public double calculateTotal()  {
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double getTotal() {
        return total;
    }
}
