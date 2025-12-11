package org.example.ex_03_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API1_TestNG_TC {

    String pincode = "110048";

    @Test
    public void Test_Get_Positive_TC1(){
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test (enabled = false)
    public void Test_Get_Negative_TC2(){
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

    @Test (enabled = false)
    public void Test_Get_Negative_TC3(){
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}

//  ctrl+alt+L = to format .xml file