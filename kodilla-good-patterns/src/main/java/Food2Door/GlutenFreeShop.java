package Food2Door;

public class GlutenFreeShop implements Producer{
    public boolean process(Order order) {
        if (order.getQuantity() >= 1) {
            System.out.println("Order"  + order.getProduct() + ", quantity: " + order.getQuantity());
            return true;
        }
        return false;
    }
}
