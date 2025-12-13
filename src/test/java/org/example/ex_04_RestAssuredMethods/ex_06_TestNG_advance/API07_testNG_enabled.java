package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.Test;

public class API07_testNG_enabled {
    @Test (enabled = false)
    public void test_tc01() {
        System.out.println("1");

    }

    @Test (enabled = true)
    public void test_tc02() {
        System.out.println("2");

    }

    @Test(enabled = false)
    public void test_tc03() {
        System.out.println("3");

    }
}

//enabled is use when the tc are not ready/ready or should be excluded/included.
