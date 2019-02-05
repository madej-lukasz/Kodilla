package Food2Door;

public class HealthyShop implements Producer{
    public boolean process(Order order) {
        if (order.getQuantity() >= 1) {
            System.out.println("Order:\n " + order.getProduct() + ", quantity: " + order.getQuantity());
            return true;
        }
        return false;
    }
}
