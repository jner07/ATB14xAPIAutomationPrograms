package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.*;

public class API10_testNG_AllParameters {
    @BeforeSuite
    public void test_tc01() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void test_tc02() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void test_tc03() {
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void test_tc04() {
        System.out.println("BeforeMethod");
    }
    @Test
    public void test_tc05() {
        System.out.println("Test");
    }
    @AfterMethod
    public void test_tc06() {
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void test_tc07() {
        System.out.println("AfterClass");
    }
    @AfterTest
    public void test_tc08() {
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void test_tc09() {
        System.out.println("AfterSuite");
    }
}
