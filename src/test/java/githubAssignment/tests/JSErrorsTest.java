package githubAssignment.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import utilities.Driver;

public class JSErrorsTest {

    @Test
    public void test() {

        //http://localhost:7080/javascript_error

        //JavaScript Error
        //
        //Test finds the JavaScript error on the page.
        //Test asserts that the page contains error: Cannot read property 'xyz' of undefined

        Driver.getDriver().get("http://localhost:7080/javascript_error");
        String errorText = "Cannot read property 'xyz' of undefined";

        LogEntries logEntries = Driver.getDriver().manage().logs().get(LogType.BROWSER);

        boolean flag = false;

        /*
        for (int i = 0; i < logEntries.getAll().size(); i++) {

            if (logEntries.getAll().get(i).getMessage().contains(errorText))
            {
                flag = true;
                break;
            }
        }

         */

        for (LogEntry each : logEntries) {
            if (each.getMessage().contains(errorText)) {
                flag = true;
                break;
            }
        }

        Assert.assertTrue(flag);



    }
}
