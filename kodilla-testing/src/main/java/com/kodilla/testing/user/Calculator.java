package com.kodilla.testing.user;

public class Calculator {

    private double sum;
    private double subtract;
    public Calculator(double a, double b) {
        this.sum = a + b;
        this.subtract = a - b;
    }
    public double getSum() {
        return sum;
    }
    public double getSubtract() {
        return subtract;
    }

}
