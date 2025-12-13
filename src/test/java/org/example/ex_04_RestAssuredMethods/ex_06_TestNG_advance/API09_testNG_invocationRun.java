package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.Test;

public class API09_testNG_invocationRun {
    @Test
    public void test_tc01() {
        System.out.println("1");

    }

    @Test (invocationCount = 3)
    public void test_tc02() {
        System.out.println("2");

    }

    @Test
    public void test_tc03() {
        System.out.println("3");

    }
}
