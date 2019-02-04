package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRepository {
    public void makeOrder(User user, Product product, Integer quantity, LocalDate orderDate) {
        System.out.println("Order processed");
    }
}
