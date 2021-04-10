package spartan;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class SpartanPractice {

    @BeforeAll
    public static void setup(){
      baseURI = "http://52.203.148.49:8000";

    }

    @AfterAll
    public static void clean(){

        reset();
    }



   @ParameterizedTest
   @MethodSource("test")

   public void deleteSpartans(Integer id){
       given()
               .pathParam("id",id)
               .when()
               .delete("/api/spartans/{id}");

   }

    public static List<Integer> test(){

      List<Integer>  list = given()
                .accept(ContentType.JSON)
                .when().get("/api/spartans").
                then().log().body().extract().jsonPath().getList("id",Integer.class);

       return list;
    }

}
