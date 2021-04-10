package soccerChallenge;

import io.restassured.path.json.JsonPath;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
public class Test2 {

    @BeforeAll
    public static void init() {
        baseURI = "http://jsonmock.hackerrank.com";
        basePath = "/api/football_matches";

    }

    @AfterAll
    public static void tearDown() {
        reset();
    }


    /*
     * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team1=Arsenal&team2=Chelsea&page=1
     *  return data for match between Arsenal(home team) and Chelsea(visiting team) , show page 1
     */
    @DisplayName("Return data for match between Arsenal(home team) and Chelsea(visiting team)")
    @Test
    public void matchesBetweenArsenalAndChelsea() {
        int sum = 0;


        JsonPath jp =
                given()
                        .log().uri()
                        .queryParam("year", "2012")
                        .queryParam("team1", "Arsenal")

                        .when()
                .get()

                        .then()
                .log().all()
                .statusCode(200).extract().jsonPath();

        Integer totalPages = jp.getInt("total_pages");

        for (int i = 1; i <= totalPages; i++) {
            System.out.println();
            System.out.println("**************************************");

            //HomeTeamLoop
            JsonPath jp2 =
                    given()
                            .log().uri()
                            .queryParam("year", "2012")
                            .queryParam("team1", "Arsenal")
                            .queryParam("page", i)

                            .when()
                    .get()

                            .then()
                    .log().all()
                    .statusCode(200).extract().jsonPath();
            System.out.println("Page Number "+i);

            for (int j = 0; j < jp2.getList("data.team1goals").size(); j++) {

                sum += jp2.getInt("data[" + j + "].team1goals");
            }

            JsonPath jp3 =
                    given()
                            .log().uri()
                            .queryParam("year", "2012")
                            .queryParam("team2", "Arsenal")
                            .queryParam("page", i)

                            .when()
                    .get()

                            .then()
                    .log().all()
                    .statusCode(200).extract().jsonPath();
            System.out.println("Page Number "+i);

            for (int j = 0; j < jp3.getList("data.team2goals").size(); j++) {

                sum += jp3.getInt("data[" + j + "].team2goals");
            }
            System.out.println("sum = " + sum);

        }

        System.out.println("sum = " + sum);

    }


}

