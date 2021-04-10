package soccerChallenge;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utilities.BrowserUtils;
import utilities.ExcelReader;

import java.util.List;
import java.util.Map;

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


    public static void main(String[] args) {

  //      System.out.println(ExcelReader.listOfMaps("src/test/resources/testDate/libraryUsers.xlsx","data"));

        List<Map<String,String>> list = ExcelReader.listOfMaps("src/test/resources/testDate/libraryUsers.xlsx","data");
//
//
//
          //  System.out.println(list);

            for (int i =0 ; i<list.size() ; i++){

                System.out.println(list.get(i));
                System.out.println("******************");
                BrowserUtils.wait(2);
            }

        System.out.println(ExcelReader.getMap("src/test/resources/testDate/libraryUsers.xlsx",5,"data"));
    }
}
