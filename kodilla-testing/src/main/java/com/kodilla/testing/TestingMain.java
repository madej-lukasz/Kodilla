package com.kodilla.testing;

import com.kodilla.testing.user.Calculator;

public class TestingMain {
    public static void main(String[] args) {


        System.out.println("Test - pierwszy test jednostkowy:");


        double a = 15;
        double b = 5;
        // stworz obiekt clalculator
        Calculator calculator = new Calculator(a,b);

        double sum = calculator.getSum();
        double subtract = calculator.getSubtract();
        System.out.println("a+b = " + sum);
        System.out.println("a-b = " + subtract);
    }
}
