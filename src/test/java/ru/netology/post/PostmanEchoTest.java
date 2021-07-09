package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class PostmanEchoTest {
    @Test
    void shouldReturnDemoAccounts() {
        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Приветствую")// отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()// Выполняемые действия
                .post("/post")
                .then()// Проверки
                .statusCode(200)
                .body("data", equalTo("Приветствую"))
        ;
    }
}
