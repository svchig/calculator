package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Siarhei_Chyhir on 12/8/2015.
 */
public class MultAndDivTest extends BaseCalculatorTest {

    @Test(groups = "gr")
    public void divOneValueByAnother(){
        double result = calculator.div(3D, 2D);
        Assert.assertEquals(result, 1.5D, "Invalid result of operation");
    }

    @Test(expectedExceptions = {NumberFormatException.class, ExceptionInInitializerError.class})
    public void checkDivisionByZeroThrowsException(){long result = calculator.div(3L, 0L);}

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = ".*divide.*")
    public void checkDivisionByZeroThrowsExceptionMessage() {
        long firstArg = 3L;
        long secondArg = 0L;
        calculator.div(firstArg, secondArg);
    }
}
