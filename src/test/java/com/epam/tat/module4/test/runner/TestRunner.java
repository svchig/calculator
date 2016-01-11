package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.test.listners.MyTestListner;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siarhei_Chyhir on 12/8/2015.
 */
public class TestRunner {
    public static void main(String[] args){
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();
//        tng.addListener(new MySuiteListener());
        tng.addListener(new MyTestListner());


        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");

        List<String> files = new ArrayList<String>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/resources/suites/calculator.xml");
            add("./src/test/resources/suites/parallel.xml");
        }});
        suite.setSuiteFiles(files);
        suite.setParallel(XmlSuite.ParallelMode.METHODS);
        suite.setThreadCount(4);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng.setXmlSuites(suites);
        tng.run();
    }
}
