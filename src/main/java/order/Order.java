package order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNo;
    private List<LineItem> lineItems = new ArrayList<LineItem>();

    public void addLineItem(Product product, int quantity) {
        LineItem lineItem = new LineItem(quantity, product);
        lineItems.add(lineItem);
    }
    public double calculateTotal()  {
        double total = 0.0;
        for(LineItem lineItem : lineItems) {
            total += lineItem.getLineItemTotal();
        }
        return total;
    }
    public void save() {
        //bunch of SQL commands for writing to the database here
    }

    public void print()  {
        // assuming we want to print to the console, a bunch of println commands here
        //
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public int getOrderNo() {
        return orderNo;
    }
}
