package com.kodilla.good.patterns.challenges;

public class InformationService {
    public  void inform(User user, Product product, Integer quantity){
        System.out.println("You have bought: " + product.getProductName());
    }
}
