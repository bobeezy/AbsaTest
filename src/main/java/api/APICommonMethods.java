package main.java.api;

/**
 * @author lionel.mangoua
 * date: 21/07/20
 */

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import main.java.Engine.DriverFactory;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class APICommonMethods extends DriverFactory {

    public static String getValueFromJson(ValidatableResponse response, String jsonPath) {

        String value = response.extract().jsonPath().getString(jsonPath);
        value = value.replaceAll("\\[", "").replaceAll("\\]", "");
        return value;
    }

    //region <GET method>
    public ValidatableResponse getMethod(String endpoint, Map header) {

        log("Method: GET\n---------------- URL ------------------\n"
                + RestAssured.baseURI + "" + RestAssured.basePath + endpoint, "INFO", "text");

        log("--------------- HEADERS ---------------\n" + header, "INFO", "text");

        response =
                given().
                        spec(requestSpec).
                        headers(header).
                        when().
                        get(endpoint).
                        then();

        log("--------------- RESPONSE ---------------\n", "INFO", "text");
        log(response.extract().body().asString(), "INFO", "json");

        return response;
    }
    //endregion
}
