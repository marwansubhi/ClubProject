package testBasePackage;

import static io.restassured.RestAssured.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class TestBase {

    protected static String owner = "yourusername";
    protected static String repo = "bermuda_investor.emma";
    @Before
    public  void setup(){

        baseURI = "https://api.github.com";
    }

    @After
    public  void clean(){

        reset();
    }
}
