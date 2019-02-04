package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Random;

public class OrderService {
    public boolean order(User user, Product product, Integer quantity, LocalDate orderDate) {
        Random random = new Random();
        return  random.nextBoolean();
    }
}
