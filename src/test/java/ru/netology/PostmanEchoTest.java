package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

 class PostmanEchoTest {
    @Test
    void ShouldShowPostman () {
        given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("info data")
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .body("data", equalTo("info data"));
    }

}
