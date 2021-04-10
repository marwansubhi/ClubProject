package githubAssignment.tests;

import githubAssignment.pages.DropDowns;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class DropDownTest {

    DropDowns dropDowns = new DropDowns();
    @Test
    public void Test(){

        //Dropdown
        //
        //Test selects Option 1 and Option 2 from the drop down menu.
        //Test asserts Option 1 and Option 2 are selected.

        Driver.getDriver().get("http://localhost:7080/dropdown");

        Select select = new Select(dropDowns.select);

        select.selectByIndex(1);
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Option 1"));

        select.selectByIndex(2);


        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Option 2"));
    }
}
