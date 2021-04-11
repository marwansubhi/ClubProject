package githubAssignment.tests;

import githubAssignment.pages.Iframe;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utilities.Driver;

public class IframeTest {

    Iframe iframe = new Iframe();
    @Test
    public void test(){

        // http://localhost:7080/iframe

        //Iframe
        //
        //Test switches to Iframe and types some text.
        //Test asserts that the typed text is as expected.

        Driver.getDriver().get("http://localhost:7080/iframe");

        Driver.getDriver().switchTo().frame(iframe.childFrame);

        String message = "Hello World";
        iframe.body.clear();
        iframe.body.sendKeys(message);

        System.out.println(iframe.body.getText());

        Assert.assertTrue(iframe.body.getText().contains(message));

    }
}
