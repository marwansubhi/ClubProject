package soccerChallenge;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;
public class GamesPerYearTest extends GamesPerYearBaseTest {


    @DisplayName("Getting total number of games of a team in a given year")
    @Test
    public void test(){


    JsonPath jsonPathA = given()
                .queryParam("year" , 2013)
                .queryParam("team1", "Norwich City").
        when()
                .get().
        then()
                .extract()
                .jsonPath()
                ;

        int numberOfPagesA = jsonPathA.getInt("total_pages");
        int totalObjectsA = jsonPathA.getInt("per_page");

        int countNumberOfGoals = 0;
        for (int j = 1; j <= numberOfPagesA; j++) {
            for (int i = 0; i < totalObjectsA; i++) {
                countNumberOfGoals +=   jsonPathA.getInt("data["+i+"].team1goals");
            }
        }

        JsonPath jsonPathB = given()
                .queryParam("year" , 2013)
                .queryParam("team2", "Norwich City").
                        when()
                .get().
                        then()
                .extract()
                .jsonPath()
                ;

        int numberOfPagesB = jsonPathB.getInt("total_pages");
        int totalObjectsB = jsonPathB.getInt("per_page");


        for (int j = 1; j <= numberOfPagesB; j++) {
            for (int i = 0; i < totalObjectsB; i++) {
                countNumberOfGoals +=   jsonPathB.getInt("data["+i+"].team2goals");
            }
        }


        System.out.println("countNumberOfGoals = " + countNumberOfGoals);

        System.out.println("getNumberOfGoals(\"Norwich City\",2013) = " + getNumberOfGoals("Norwich City", 2013));

    }


















    public static int getNumberOfGoals (String teamName , int year){


        JsonPath jsonPathA = given()
                .queryParam("year" , year)
                .queryParam("team1", teamName).
                        when()
                .get().
                        then()
                .extract()
                .jsonPath()
                ;

        int numberOfPagesA = jsonPathA.getInt("total_pages");
        int totalObjectsA = jsonPathA.getInt("per_page");

        int countNumberOfGoals = 0;
        for (int j = 1; j <= numberOfPagesA; j++) {
            for (int i = 0; i < totalObjectsA; i++) {
                countNumberOfGoals +=   jsonPathA.getInt("data["+i+"].team1goals");
            }
        }

        JsonPath jsonPathB = given()
                .queryParam("year" , year)
                .queryParam("team2", teamName).
                        when()
                .get().
                        then()
                .extract()
                .jsonPath()
                ;

        int numberOfPagesB = jsonPathB.getInt("total_pages");
        int totalObjectsB = jsonPathB.getInt("per_page");


        for (int j = 1; j <= numberOfPagesB; j++) {
            for (int i = 0; i < totalObjectsB; i++) {
                countNumberOfGoals +=   jsonPathB.getInt("data["+i+"].team2goals");
            }
        }

        return countNumberOfGoals;
    }


}
/*
 *
 * * This is a hacker rank challenge give in the interview
 * Given this endpoint for getting football match data
 * http://jsonmock.hackerrank.com/api/football_matches
 * below query params are available
 * year  :  year the match occurred
 * team1 :  home team name
 * team2 :  visiting team name
 * page  :  page number , max result in per response is 10
 *           any result more than 10 will be on next pages
 *           so in order to get all data you need to
 *           make separate requests until there are no more pages
 *
 * Response Format :
 *  {
 *     "page": "1",
 *     "per_page": 10,
 *     "total": 23,
 *     "total_pages": 3,
 *     "data": [
 *         {
 *             "competition": "UEFA Champions League",
 *             "year": 2012,
 *             "round": "GroupB",
 *             "team1": "Arsenal",
 *             "team2": "Olympiacos",
 *             "team1goals": "3",
 *             "team2goals": "1"
 *         },
 *         {...},
 *         {...}
 *         ]
 *  }
 *
 * Examples Requests :
 *
 * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team1=Arsenal&team2=Chelsea&page=1
 *  return data for match between Arsenal(home team) and Chelsea(visiting team) , show page 1
 * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team1=Arsenal&page=1
 *  return data for 2012 match between Arsenal(home team) and any visiting team and show page 2
 * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team2=Arsenal&page=2
 *  return data for match between any home team) and Chelsea(visiting team) and show page 2
 *
 *  Write a method to return total goals of a team in a given year
 *      * Include the both result where the team is home team or visiting team
 */
