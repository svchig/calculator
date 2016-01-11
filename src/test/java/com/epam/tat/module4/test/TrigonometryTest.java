package com.epam.tat.module4.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Siarhei_Chyhir on 12/8/2015.
 */
public class TrigonometryTest extends BaseCalculatorTest {

    @Test(priority = 3)
    public void sin0(){
        double result = calculator.sin(0);
        assertEquals(result, 0.0);
    }

    //@Test(dependsOnMethods = "sin0")
    @Test(priority = 0)
    public void sin30() {
        double result = round(calculator.sin(Math.PI / 6));
        assertEquals(result, 0.5);
    }

    //@Test(dependsOnMethods = "sin30")
    @Test(priority = 2)
    public void sin45() {
        double result = round(calculator.sin(Math.PI / 4));
        assertEquals(result, 0.7071);
    }

    private double round (double value){return (double)Math.round(value * 10000d) / 10000d;}
}
