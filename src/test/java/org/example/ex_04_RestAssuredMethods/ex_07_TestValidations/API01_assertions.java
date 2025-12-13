package org.example.ex_04_RestAssuredMethods.ex_07_TestValidations;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class API01_assertions {


//Hard assert will look for expected value and will not run the next cases
    @Test
    public void test_Hardassert(){
        System.out.println("Start");
        Assert.assertEquals("jayesh", "Jayesh");
        System.out.println("end");
    }

//soft assert will execute all the test cases even if expected value doesnt match
    @Test
    public void test_Softassert(){
        System.out.println("Start");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("jayesh", "Jaayesshh");
        System.out.println("end");
    }

    //AssertJ

}
