package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.Test;

public class API04_testNG_groups {
    @Test (groups = {"sanity", "reg"})   //groups method will run the tc which are mentioned together
    public void test_tc01() {
        System.out.println("1");

    }

    @Test (groups = {"reg"})  //here reg is mentioned with sanity
    public void test_tc02() {  //when we run tc02 it will run sanity and reg both
        System.out.println("2");

    }

    @Test (groups = {"smoke"})
    public void test_tc03() {
        System.out.println("3");

    }
}
