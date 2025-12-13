package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.Test;

public class API03_testNG_Priority {

    @Test (priority = 2)
    public void test_tc01() {
        System.out.println("1");

    }

    @Test(priority = 3)
    public void test_tc02() {
        System.out.println("2");

    }

    @Test(priority = 1)
    public void test_tc03() {
        System.out.println("3");

    }
}

//priority 0 or any -1, -2 will have the highest priority and printed first
//default value is 0