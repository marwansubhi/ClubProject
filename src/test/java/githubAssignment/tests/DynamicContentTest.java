package githubAssignment.tests;

import githubAssignment.pages.DynamicContent;
import org.junit.Assert;
import org.junit.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class DynamicContentTest {

    DynamicContent dc = new DynamicContent();
    @Test
    public void test(){

        //http://localhost:7080/dynamic_content

        //Dynamic Content
        //
        //Test refreshes the page a couple of times.
        //Test asserts that the content changes on each refresh.

        Driver.getDriver().get("http://localhost:7080/dynamic_content");


        String expectedT1 = dc.firstText.getText();
        String expectedT2 = dc.secondText.getText();
        String expectedT3 = dc.thirdText.getText();
        BrowserUtils.wait(1);
        Driver.getDriver().navigate().refresh();

        Assert.assertNotEquals(expectedT1, dc.firstText.getText());
        Assert.assertNotEquals(expectedT2, dc.secondText.getText());
        Assert.assertNotEquals(expectedT3, dc.thirdText.getText());




    }
}
