package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import testBasePackage.TestBase;
import static org.hamcrest.Matchers.*;
import utilities.ConfigurationReader;

import java.util.LinkedHashMap;
import java.util.Map;


public class UpdateRepoStepDefinitions  {
   static String token = ConfigurationReader.getProperty("token");
    @Given("user is successfully logged in and authorized")
    public void user_is_successfully_logged_in_and_authorized() {


        System.out.println("hello");
        //
        //GET /repos/{owner}/{repo}

        baseURI = "https://api.github.com";

        JsonPath jsonPath =   given()
                .auth().oauth2(token)
                .pathParam("owner","yourusername")
                .pathParam("repo","bermuda_investor.emma").
        when()
                .get("/repos/{owner}/{repo}")  .
        then()
                .log().body()
                .statusCode(200)
                .extract().jsonPath();

        String owner = jsonPath.getString("owner.login");
        assertThat(owner,equalTo(owner));

    }




    @When("user is sending update end point{string},with new name {string}")
    public void userIsSendingUpdateEndPointWithNewName(String arg0, String newName) {
        //PATCH /repos/{owner}/{repo}


        arg0 = "/repos/yourusername/"+newName;

        Map<String ,String> body = new LinkedHashMap<>();

        body.put("name",newName);
        given()
                .auth().oauth2(token)

                .body(body).
        when()
                .patch(arg0).
        then()
                .log().body()
                .statusCode(200);


    }


    @Then("the patch should be processed successfully with the status code {int} and new name is {string}")
    public void the_patch_should_be_processed_successfully_with_the_status_code_and_new_name_is(Integer int1, String newName) {

        given()
                .auth().oauth2(token).
        when()
                .get("/repos/"+"yourusername"+"/"+newName).

        then()
                .assertThat()
                .statusCode(is(equalTo(int1)))
                .body("name",equalTo(newName))

                ;

    }

    /*
    @Test
      public void test() {
        String token = ConfigurationReader.getProperty("token");

        given()

                .pathParam("owner",owner)
                .pathParam("repo",repo).
                when()
                .get("/repos/{owner}/{repo}")  .
                then()
                .log().body()
                .statusCode(200)
                .body("owner.login",equalTo(owner));



    }

     */


//    public static void main(String[] args) {
//
//        baseURI = "https://api.github.com";
//        Map<String ,String> body = new LinkedHashMap<>();
//
//        body.put("name","my new repo name");
//     String   path = "/repos/marwansubhi/bermuda_investor.emma";
//
//        given()
//                .auth().oauth2(token)
//                .body(body)
//                .
//                        when()
//                .patch(path).
//                then()
//                .log().body()
//                .statusCode(200);
//
//
//    }







}
