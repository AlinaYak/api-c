package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200);
    }
}