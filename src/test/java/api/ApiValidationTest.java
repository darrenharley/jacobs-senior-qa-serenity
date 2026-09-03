package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiValidationTest {

    @Test
    void shouldReturn200Response() {

        Response response =
                RestAssured
                        .given()
                        .when()
                        .get("https://jsonplaceholder.typicode.com/posts/1");

        assertThat(response.statusCode())
                .isEqualTo(200);

        assertThat(response.jsonPath().getInt("id"))
                .isEqualTo(1);
    }
}