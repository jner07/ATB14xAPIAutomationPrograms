package org.example.ex_04_RestAssuredMethods.ex_06_TestNG_advance;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class API06_testNG_parameters {

    @Parameters ("browser")
    @Test
    public void demo(String value) {
        System.out.println("You're running this tc");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Starting tc with chrome");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Starting tc with firefox");
        }
    }

}
