package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.addAtoB(10,25);
        double subResult = calculator.subBFromA(15,3);
        double mulResult = calculator.mulAByB(3,3);
        double divResult = calculator.divAbyB(100,10);

        //Then
        Assert.assertEquals(35, addResult,0.001);
        Assert.assertEquals(12, subResult,0.001);
        Assert.assertEquals(9, mulResult,0.001);
        Assert.assertEquals(10, divResult,0.001);

    }
}
