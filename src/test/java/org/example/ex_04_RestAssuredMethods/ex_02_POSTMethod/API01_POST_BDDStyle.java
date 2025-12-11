package org.example.ex_04_RestAssuredMethods.ex_02_POSTMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class API01_POST_BDDStyle {

    @Test
    public void test_AUTH_TOKEN(){
        String payload = "{\n" +
                "  \"username\" : \"admin\",\n" +
                "  \"password\" : \"password123\"\n" +
                "}";

        RestAssured
                //given -- preparation of request
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)

                //when --- making of request
                .when().post()

                //then -- verification of request
                .then().log().all().statusCode(200);
    }
}
