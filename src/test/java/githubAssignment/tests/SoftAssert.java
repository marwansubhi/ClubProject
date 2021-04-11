package githubAssignment.tests;

import githubAssignment.pages.MouseHover;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import org.testng.Assert.*;

public class SoftAssert {

    MouseHover mh = new MouseHover();

    @Test
    public void test() {

        // http://localhost:7080/hovers

        //Mouse Hover
        //
        //Test does a mouse hover on each image.
        //Test asserts that additional information is displayed for each image.

        org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();

        softAssert.assertTrue(5==10);
        softAssert.assertTrue(7==10);
        softAssert.assertTrue(58==10);
        softAssert.assertTrue(58==10);
        softAssert.assertTrue(10==10);
        softAssert.assertTrue(5==10);

        softAssert.assertAll();




//        org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();
//        Driver.getDriver().get("http://localhost:7080/hovers");
//
//        Actions actions = new Actions(Driver.getDriver());
//
//        //  System.out.println(mh.text1.isDisplayed());//false
//        actions.moveToElement(mh.firstImage);
//        // System.out.println(mh.text1.isDisplayed());//true
//
//
//        softAssert.assertTrue(mh.text1.isDisplayed());
//        // Assert.assertTrue(mh.text1.isDisplayed());
//
//
//        actions.moveToElement(mh.secondImage).build().perform();
//
//        Assert.assertTrue(mh.text2.isDisplayed());
//
//        actions.moveToElement(mh.thirdImage).build().perform();
//
//        Assert.assertTrue(mh.text3.isDisplayed());
//
//        softAssert.assertAll();
    }
}
