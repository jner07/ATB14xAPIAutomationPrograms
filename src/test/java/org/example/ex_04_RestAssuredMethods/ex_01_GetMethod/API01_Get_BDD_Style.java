package org.example.ex_04_RestAssuredMethods.ex_01_GetMethod;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API01_Get_BDD_Style {

    @Test
    public void test_GET_POSITIVE (){
        String pincode = "12345";
        pincode = "500048";

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
