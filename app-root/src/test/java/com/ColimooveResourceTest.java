package com;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

@QuarkusTest
public class ColimooveResourceTest {

    @Test
    public void testHelloEndpoint() throws JSONException {
        String actualResult = RestAssured.given()
                .when().get("/colimoove/api/v1")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        var expectedResult = """
                {
                "applicationName":"colimoove",
                "version":"1.0.0"
                }""";
        JSONAssert.assertEquals(actualResult, expectedResult, true);
    }

}