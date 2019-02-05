package Food2Door;

public class ExtraFoodShop  implements Producer {
    public boolean process(Order order) {
        if (order.getQuantity() >= 1) {
            System.out.println("Ordered:  " + order.getProduct() + ", quantity: " + order.getQuantity() );
            return true;
        }
        return false;
    }
}

