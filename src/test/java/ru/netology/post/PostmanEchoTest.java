package ru.netology.post;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void shouldCheckoutPostmanEcho(){
        given()
                .baseUri("https://postman-echo.com")
                .body("China banning beards and mosques") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data",equalTo("China banning beards and mosques"));


    }
}
