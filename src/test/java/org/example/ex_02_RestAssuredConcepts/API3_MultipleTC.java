package org.example.ex_02_RestAssuredConcepts;

import io.restassured.RestAssured;

public class API3_MultipleTC {
    public static void main(String[] args) {
        String pincode = "500048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        String pincode2 = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode2)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        String pincode3 = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode3)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}

//this is restassured test case - which will pull data for the string from the given URL
//given, when, then are conditions used here
//given is source
//when is condition
//then is action
//log.all gives API logs in output >> this will print everything

//here, if we run 3 test cases and any one of them fails, it will throw errors for all the next cases.
//to overcome, we'll use TESTNG
