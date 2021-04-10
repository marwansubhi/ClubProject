package githubAssignment.tests;

import githubAssignment.pages.DynamicLoading;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class DynamicLoadingTest {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    DynamicLoading dl = new DynamicLoading();
    @Test
    public void test(){

        //Dynamic Loading
        //
        //Test clicks the start button and uses explicit wait.
        //Test asserts that “Hello World!” text is displayed.
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//
//        Driver.getDriver().get("http://localhost:7080/dynamic_loading/2");
//
//        WebElement startButton= Driver.getDriver().findElement(By.xpath("//*[@id='start']/button"));
//
//        WebElement helloWA= Driver.getDriver().findElement(By.xpath("(//h4)[2]"));
//
//        startButton.click();
//
//        Driver.getDriver().findElement(By.xpath("//*[.='Start']")).click();
//
//        wait.until(ExpectedConditions.visibilityOf(helloWA));
//
//        Assert.assertTrue(helloWA.isDisplayed());
//
//        Assert.assertTrue(helloWA.getText().equals("Hello World!"));


        Driver.getDriver().get("http://localhost:7080/dynamic_loading/2");
        dl.startButton.click();
        wait.until(ExpectedConditions.visibilityOf(dl.helloWorld));
        Assert.assertTrue(dl.helloWorld.getText().equals("Hello World!"));




    }
}
