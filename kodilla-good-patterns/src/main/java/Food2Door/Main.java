package Food2Door;

public class Main {
    public static void main(String[] args) {
        Producer healthyShop = new HealthyShop();
        Order order = new Order(healthyShop, "Vitamins C",1);
        OrderService orderService = new OrderService(healthyShop,order);
        orderService.orderConfirmation(order);
    }
}
