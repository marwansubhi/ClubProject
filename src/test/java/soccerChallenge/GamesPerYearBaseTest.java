package soccerChallenge;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
public class GamesPerYearBaseTest {

    @BeforeAll
    public static void setup(){

        baseURI = "http://jsonmock.hackerrank.com/api";
        basePath ="/football_matches";
    }

    @AfterAll
    public static void teardown(){
        reset();
    }

}
