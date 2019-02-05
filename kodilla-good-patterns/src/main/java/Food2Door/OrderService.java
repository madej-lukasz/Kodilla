package Food2Door;

public class OrderService {
    Producer producer;
    Order order;

    public OrderService(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }
    public void orderConfirmation(final Order order){
        boolean isOrdered = producer.process(order);
        if (isOrdered) {
            System.out.println("Final order\n " + order);
        }else{
            System.out.println("Order incomplete, please change.");
        }
    }

}
