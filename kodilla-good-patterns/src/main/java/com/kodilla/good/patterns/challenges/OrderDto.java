package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private Product product;
    private User user;
    private Boolean orderChecked;

    public OrderDto(Product product, User user, Boolean orderChecked) {
        this.product = product;
        this.user = user;
        this.orderChecked = orderChecked;
    }

    public Product getOrderRequest() {
        return product;
    }
    public User getUser () {
        return user;
    }

    public Boolean getOrderChecked() {
        return orderChecked;
    }
}
