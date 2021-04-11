package githubAssignment.tests;

import githubAssignment.pages.WindowHandle;
import org.junit.Assert;
import org.junit.Test;
import utilities.Driver;

import java.util.Set;

public class WindowHandleTest {
    WindowHandle windowHandle = new WindowHandle();

    @Test
    public void test() {

        Driver.getDriver().get("http://localhost:7080/windows");


        windowHandle.link.click();

        String mainHandle = Driver.getDriver().getWindowHandle();



        Set<String> handles = Driver.getDriver().getWindowHandles();

        System.out.println("*************************");
        for (String handle : handles) {

            Driver.getDriver().switchTo().window(handle);

            System.out.println(Driver.getDriver().getTitle());

        }

        Assert.assertTrue(Driver.getDriver().getTitle().equals("New Window"));


    }
}
