package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Application {
    public static void main(String args[]){
        Product item = new Product("Mobile phone", "123");
        User user1 = new User("Jan", "007");
        Order order1 = new Order(user1,item,1, LocalDate.now());
        InformationService informationService1 = new InformationService();
        OrderService orderService1 = new OrderService();
        OrderRepository orderRepository1 = new OrderRepository();

        ProductOrderService productOrderService1 = new ProductOrderService(informationService1,orderService1,orderRepository1);
        OrderDto orderDto1 = productOrderService1.process(order1);
        System.out.println("Well done, Thank you");

    }

}
