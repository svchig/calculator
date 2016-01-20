package com.epam.tat.module4.test;

import org.testng.annotations.BeforeClass;
import com.epam.tat.module4.

import java.util.Date;

/**
 * Created by Siarhei_Chyhir on 12/8/2015.
 */
public class BaseCalculatorTest {
    public Calculator calculator;

    @BeforeClass(groups = "base")
    public void setUp() {calculator = new Calculator();}

    protected void checkTime(){
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}
