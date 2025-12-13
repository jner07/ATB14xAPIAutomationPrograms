package org.example.ex_04_RestAssuredMethods.ex_05_DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API01_Delete_nonBDD_style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public  void test_put_nonBDD(){

        String token = "427ed795648de17";  //create Auth token
        String bookingId = "1216";             //Create booking TC by AI


        r = RestAssured.given();
        r = r.baseUri("https://restful-booker.herokuapp.com");
        r = r.basePath("/booking/" + bookingId);

        r.contentType(ContentType.JSON);
        r.cookie("token", token);

        response = r.when().log().all().delete();

        vr = response.then().log().all();
        vr.statusCode(200);

 //you cannot delete only one key >> you can delete entire record


    }
}
