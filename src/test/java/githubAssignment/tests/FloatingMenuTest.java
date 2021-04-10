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



        // To refresh browser window using Javascript
        js.executeScript("history.go(0)");


        //  To get innertext of the entire webpage in Selenium
        String sText =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(sText);


        //  To get the Title of our webpage
        String sText1 =  js.executeScript("return document.title;").toString();
        System.out.println(sText1);

        // To get the domain
        String sText2 =  js.executeScript("return document.domain;").toString();
        System.out.println(sText2);

        //  To get the URL of a webpage
        String sText3 =  js.executeScript("return document.URL;").toString();
        System.out.println(sText3);

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
        char a = 5;

        System.out.println();

    }
}
