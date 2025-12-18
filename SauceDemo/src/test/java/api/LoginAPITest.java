package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class LoginAPITest extends BaseAPITest {

    @Test
    public void loginApiTest() {

        String payload = "{\n" +
                "  \"username\": \"kminchelle\",\n" +
                "  \"password\": \"0lelplR\"\n" +
                "}";

        given()
            .header("Content-Type", "application/json")
            .body(payload)
        .when()
            .post("/auth/login")
        .then()
            .statusCode(200)
            .body("token", notNullValue());
    }
}
