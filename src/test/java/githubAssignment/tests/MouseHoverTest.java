package githubAssignment.tests;

import githubAssignment.pages.MouseHover;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class MouseHoverTest {

    MouseHover mh = new MouseHover();
    @Test
    public void test(){

        // http://localhost:7080/hovers

        //Mouse Hover
        //
        //Test does a mouse hover on each image.
        //Test asserts that additional information is displayed for each image.


        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get("http://localhost:7080/hovers");

        Actions actions = new Actions(Driver.getDriver());

      //  System.out.println(mh.text1.isDisplayed());//false
        actions.moveToElement(mh.firstImage);
       // System.out.println(mh.text1.isDisplayed());//true


        softAssert.assertTrue(mh.text1.isDisplayed());
       // Assert.assertTrue(mh.text1.isDisplayed());


        actions.moveToElement(mh.secondImage).build().perform();

        Assert.assertTrue(mh.text2.isDisplayed());

        actions.moveToElement(mh.thirdImage).build().perform();

        Assert.assertTrue(mh.text3.isDisplayed());

        softAssert.assertAll();

    }

    @Test
    public void test2(){

    }
}
