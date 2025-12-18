package api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ReqResAPITest {

    @Test
    public void getUserTest() {
        given()
        .when()
            .get("https://reqres.in/api/users/2")
        .then()
            .statusCode(200);
    }
}
