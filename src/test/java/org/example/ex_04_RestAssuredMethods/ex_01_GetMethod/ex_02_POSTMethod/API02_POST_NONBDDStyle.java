package org.example.ex_04_RestAssuredMethods.ex_01_GetMethod.ex_02_POSTMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API02_POST_NONBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_POST_Create_Token(){

        String payload = "{\n" +
                "  \"username\" : \"admin\",\n" +
                "  \"password\" : \"password123\"\n" +
                "}";

        //Part1
        r= RestAssured.given();
        r=  r.baseUri("https://restful-booker.herokuapp.com");
        r = r.basePath("/auth");
        r = r.contentType(ContentType.JSON);
        r = r. body(payload).log().all();

        //Part2
        response = r.when().log().all().post();

        //Part3
        vr = response.then().log().all();
        vr.statusCode(200);


    }
}
