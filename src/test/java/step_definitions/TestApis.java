package step_definitions;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import testBasePackage.TestBase;
import utilities.ConfigurationReader;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
public class TestApis {

    static String token = ConfigurationReader.getProperty("token");
    @Test
    public void test(){
        baseURI = "https://api.github.com";



        Map<String ,String> body = new LinkedHashMap<>();

        Faker faker = new Faker();

        String newName= faker.name().name();
        body.put("name",newName);

      String name =  given()
                .auth().oauth2(token)

                .body(body).
                 when()
                .patch("/repos/yourusername/trafficway_violet.distzjhgg").
                then()
                .log().body()
                .statusCode(200)
                .extract().jsonPath().getString("name");




    }
}
