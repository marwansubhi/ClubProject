package githubAssignment.tests;

import githubAssignment.pages.FloatingMenu;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utilities.BrowserUtils;
import utilities.Driver;

public class FloatingMenuTest {

    FloatingMenu fl = new FloatingMenu();

    @Test
    public void test(){

        //Floating Menu
        //
        //Test scrolls the page.
        //Test asserts that the floating menu is still displayed.

        Driver.getDriver().get("http://localhost:7080/floating_menu");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

      //  js.executeScript("arguments[0].scrollIntoView(true);",fl.bottomLink);
        Assert.assertTrue(fl.floatingBar.isDisplayed());


        for (int i =1; i<7; i++){

            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 750)");

            Assert.assertTrue(fl.floatingBar.isDisplayed());
        }

        for (int i =1; i<7; i++){

            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, -750)");

            Assert.assertTrue(fl.floatingBar.isDisplayed());
        }


    }
}
