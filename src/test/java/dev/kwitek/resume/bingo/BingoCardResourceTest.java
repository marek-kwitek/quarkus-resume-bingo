package dev.kwitek.resume.bingo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BingoCardResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/bingo-card")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}