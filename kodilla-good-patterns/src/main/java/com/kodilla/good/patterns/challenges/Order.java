package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Order {
    private User user;
    private Product product;
    private Integer quantity;
    private LocalDate orderDate;

    public Order(User user, Product product, Integer quantity, LocalDate orderDate) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
