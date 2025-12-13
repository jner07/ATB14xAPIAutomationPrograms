package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API02_TestNG_BeforeTEST {

    @BeforeTest
    public void test_tco2(){
        System.out.println("hi i am before");
    }

    @Test
    public void test_tco3(){
        System.out.println("hi i am main tc");
    }

    @AfterTest
    public void test_tco4(){
        System.out.println("hi i am after");
    }
}
