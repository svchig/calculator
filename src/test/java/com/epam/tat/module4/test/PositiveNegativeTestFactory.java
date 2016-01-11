package com.epam.tat.module4.test;

import org.testng.annotations.Factory;

/**
 * Created by Siarhei_Chyhir on 12/8/2015.
 */
public class PositiveNegativeTestFactory {

    @Factory
    public Object[] getTests(){
        return new Object[]{
            new PositiveNegativeTest(10, true, false),
            new PositiveNegativeTest(0, false, false)
        };
    }
}
