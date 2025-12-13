package org.example.ex_04_RestAssuredMethods.ex_04_PATCHMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API01_Non_BDD_Style {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public  void test_put_nonBDD(){

        String token = "427ed795648de17";  //create Auth token
        String bookingId = "1216";             //Create booking TC by AI

        String payload = "{\n" +
                "    \"firstname\" : \"Jayesh\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r = r.baseUri("https://restful-booker.herokuapp.com");
        r = r.basePath("/booking/" + bookingId);

        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();

        vr = response.then().log().all();
        vr.statusCode(200);




    }
}
