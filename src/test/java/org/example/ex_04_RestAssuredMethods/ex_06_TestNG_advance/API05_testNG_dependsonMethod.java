package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.Test;

public class API05_testNG_dependsonMethod {

    @Test (dependsOnMethods = "serverStartedOK")  //as dependsonmethods is added to this TC
    //everytime when you run tc01, it will run the serverStartedOK as dependent test case
    public void test_tc01() {
        System.out.println("tc01 ");

    }

    @Test
    public void serverStartedOK() {
        System.out.println("tc02");

    }

    @Test
    public void test_tc03() {
        System.out.println("tc03");

    }

}
