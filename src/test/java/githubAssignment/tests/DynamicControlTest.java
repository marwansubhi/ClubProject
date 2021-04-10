package githubAssignment.tests;

import githubAssignment.pages.DynamicControl;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class DynamicControlTest {

    DynamicControl dc = new DynamicControl();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Test()
    public void test() {

        //Dynamic Controls
        //
        //Test clicks on the Remove Button and uses explicit wait.
        //Test asserts that the checkbox is gone.
        //Test clicks on Add Button and uses explicit wait.
        //Test asserts that the checkbox is present.
        //Test clicks on the Enable Button and uses explicit wait.
        //Test asserts that the text box is enabled.
        //Test clicks on the Disable Button and uses explicit wait.
        //Test asserts that the text box is disabled.

        Driver.getDriver().get("http://localhost:7080/dynamic_controls");

        dc.removeButton.click();

        wait.until(ExpectedConditions.visibilityOf(dc.message));
        Assert.assertTrue(dc.message.isDisplayed());
        System.out.println(dc.message.getText());

        dc.addButton.click();

        wait.until(ExpectedConditions.visibilityOf(dc.checkBox));
        Assert.assertTrue(dc.message.isDisplayed());
        System.out.println(dc.message.getText());

        dc.enableButton.click();

        wait.until(ExpectedConditions.visibilityOf(dc.message));
        System.out.println(dc.message.getText());

        Assert.assertTrue(dc.message.getText().equals("It's enabled!"));

        dc.enableButton.click();

        wait.until(ExpectedConditions.visibilityOf(dc.message));

        Assert.assertTrue(dc.message.getText().equals("It's disabled!"));







    }


    @Test(expected = NoSuchElementException.class)
    public void test2() {

        //Dynamic Controls
        //
        //Test clicks on the Remove Button and uses explicit wait.
        //Test asserts that the checkbox is gone.
        //Test clicks on Add Button and uses explicit wait.
        //Test asserts that the checkbox is present.
        //Test clicks on the Enable Button and uses explicit wait.
        //Test asserts that the text box is enabled.
        //Test clicks on the Disable Button and uses explicit wait.
        //Test asserts that the text box is disabled.

        Driver.getDriver().get("http://localhost:7080/dynamic_controls");

        dc.removeButton.click();

        wait.until(ExpectedConditions.visibilityOf(dc.message));


        Assert.assertFalse(dc.checkBox.isDisplayed());





    }
}
