package Food2Door;

public class Order {
    private Producer producer;
    private String product;
    private int quantity;

    public Order(Producer producer, String product, int quantity) {
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{ product: " + product +
                ", quantity = " + quantity +
                '}';
    }
}

