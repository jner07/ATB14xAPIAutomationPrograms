package org.example.ex_04_RestAssuredMethods.ex_01_GetMethod.ex_01_GetMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API02_Get_NONBDD_Style {
    RequestSpecification r;    //given
    Response response;         //when
    ValidatableResponse vr;     //then
    String pincode;

   @Test
    public void test_GET_NONBDD_style(){

        pincode = "560049";
        //divide your code in 3 parts

       //given
       r = RestAssured.given();
       r.baseUri("https://api.zippopotam.us");
       r.basePath("/IN/" + pincode);

       //when
       response = r.when().log().all().get();
       System.out.println(response.asString());

       //then
       vr = response.then().log().all();
       vr.statusCode(200);





   }
}
