package step_definitions;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
public class Zipcode {
    @Test

    public void test(){

      JsonPath jsonPath = given().get("http://api.zippopotam.us/us/11201").then().extract().jsonPath();

        System.out.println(jsonPath.getString("places.'place name'"));
        System.out.println(jsonPath.getString("places.'state abbreviation'"));
    }

}
