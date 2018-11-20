package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            ;
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");


        double a = 15;
        double b = 5;
        double sum = a + b;
        double subtract = a - b;
        System.out.println("a+b = " + sum);
        System.out.println("a-b = " + subtract);
    }
}
