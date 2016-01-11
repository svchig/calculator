package com.epam.tat.module4.test.listners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by Siarhei_Chyhir on 12/11/2015.
 */
public class MyTestListner implements IInvokedMethodListener {
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method started: " + method.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method finished (" + testResult.getStatus() + "): " + method.getTestMethod().getMethodName() + "\n");
    }
}
