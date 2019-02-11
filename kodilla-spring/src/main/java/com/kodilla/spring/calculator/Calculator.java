package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    private Display display;

    public double addAtoB(double a, double b ){
        display.displayValue(a+b);
        return a+b;
    }
    public double subBFromA(double a, double b) {
        display.displayValue(a-b);
        return a-b;
    }
    public double mulAByB(double a, double b) {
        display.displayValue(a*b);
        return a*b;
    }
    public double divAbyB(double a, double b){
        display.displayValue(a/b);
        return a/b;
    }
}
