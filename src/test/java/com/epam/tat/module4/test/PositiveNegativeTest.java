package com.epam.tat.module4.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


import static com.epam.tat.module4.Timeout.sleep;
import static org.testng.Assert.assertTrue;

/**
 * Created by Siarhei_Chyhir on 12/8/2015.
 */
public class PositiveNegativeTest extends BaseCalculatorTest{

    private long value;
    private boolean expectedToBePositive;
    private boolean expectedToBeNegative;

    @Factory(dataProvider = "valuesDp")
    public PositiveNegativeTest(long value, boolean expectedToBePositive, boolean expectedToBeNegative){
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test
    public void checkValuePositive(){
        sleep(1);
        checkTime();
        assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @Test
    public void checkValueNegative(){
        sleep(1);
        checkTime();
        assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }

    @DataProvider(name = "valuesDp")
    public static Object[][] valuesForCheck(){
        return new Object[][]{
                {1, true, false},
                {-1, false, true},
                {-1000, false, true},
                {0, false, false}
        };
    }
}
