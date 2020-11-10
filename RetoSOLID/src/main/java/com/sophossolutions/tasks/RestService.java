package com.sophossolutions.tasks;

import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Performable;

import java.io.File;
import static io.restassured.RestAssured.given;

public class RestService {

    private static Response response;
    private static String endpoint = "https://gorest.co.in/public-api";
    private static int idUser;
    private static String token = "ef5748336cdf2524826a9bd02d382295d4d55491b64f255a8424048b48bcb65c";

    public static Performable InvocarApi() {

        response = given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(new File("src/main/java/com/sophossolutions/utilities/PostTest.json"))
                .post(endpoint + "/users");

        response.prettyPrint();
        JsonPath responseJson = response.jsonPath();
        idUser = responseJson.get("data.id");

        return null;
    }

    public static Performable ValidarRegistro(){

        response = given().get(endpoint + "/users/" + idUser);

        response.prettyPrint();
        JsonPath responseJson = response.jsonPath();

        return null;

    }

}
