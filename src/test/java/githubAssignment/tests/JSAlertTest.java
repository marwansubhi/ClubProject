package githubAssignment.tests;

import githubAssignment.pages.JavaScriptAlert;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import utilities.Driver;

public class JSAlertTest {

    JavaScriptAlert ja = new JavaScriptAlert();
    @Test
    public void Test(){

        //JavaScript Alerts
        //
        //Test Clicks on JS Alert Button.
        //Test asserts alert message.
        //Test clicks on JS confirm Button and clicks ok on alert.
        //Test asserts the alert message.
        //Test clicks on JS Prompt Button and types a message on Prompt.
        //Test asserts that the alert message contains the typed message.

        Driver.getDriver().get(" http://localhost:7080/javascript_alerts");

        ja.jsAlert.click();

        Alert alert = Driver.getDriver().switchTo().alert();

        Assert.assertTrue(alert.getText().equals("I am a JS Alert"));
        alert.accept();


        ja.jsConfirm.click();

        Assert.assertTrue( alert.getText().equals("I am a JS Confirm"));

        alert.accept();

        ja.jsPrompt.click();

        String text = "OK";
        alert.sendKeys(text);

        alert.accept();

        Assert.assertTrue(ja.message.getText().contains(text));



    }
}
