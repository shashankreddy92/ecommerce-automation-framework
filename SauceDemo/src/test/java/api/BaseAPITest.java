package api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseAPITest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://dummyjson.com";
    }
}
