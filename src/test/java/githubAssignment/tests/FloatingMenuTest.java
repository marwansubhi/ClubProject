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
    public void test() {

        //Floating Menu
        //
        //Test scrolls the page.
        //Test asserts that the floating menu is still displayed.

        Driver.getDriver().get("http://localhost:7080/floating_menu");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //  js.executeScript("arguments[0].scrollIntoView(true);",fl.bottomLink);
        Assert.assertTrue(fl.floatingBar.isDisplayed());


        for (int i = 1; i < 7; i++) {

            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 750)");

            Assert.assertTrue(fl.floatingBar.isDisplayed());
        }

        for (int i = 1; i < 7; i++) {

            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, -750)");

            Assert.assertTrue(fl.floatingBar.isDisplayed());
        }

    }

    @Test
    public void test2() {

        int[] arr = {0,2,3,5,0,1,4,2,3,0}; // 1, 2, -----  3,4 -----5,6----- 7,8

        int target = 5;

//        for (int i =0, j =0 ; i<arr.length && j<arr.length ; i++, j++){
//
//            if (arr[i]+arr[j]==5) System.out.println(i + "  "+j);
//
//
//        }

        //0,2,3,5,0,1,4,2,3,0
        for (int i =0 ; i<arr.length  ; i++){

            for (int j = 1; j<arr.length ; j++){

                if (arr[i]+arr[j]==target) System.out.println(i + "  "+j);
            }
        }


    }
}
