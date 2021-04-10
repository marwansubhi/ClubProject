package githubAssignment.tests;

import githubAssignment.pages.CheckBox;
import org.junit.Assert;
import org.junit.Test;
import utilities.Driver;

public class CheckBoxTest {

    CheckBox checkBox = new CheckBox();

    @Test
    public void test() {

        //Checkboxes
        //
        //Test checks and unchecks checkboxes.
        //Test uses assertions to make sure boxes were properly checked and unchecked.

        Driver.getDriver().get("http://localhost:7080/checkboxes");

        checkBox.firstBox.click();

        Assert.assertTrue(checkBox.firstBox.isSelected());

        checkBox.secondBox.click();

        Assert.assertFalse(checkBox.secondBox.isSelected());


        checkBox.firstBox.click();
        Assert.assertFalse(checkBox.firstBox.isSelected());
//
        checkBox.secondBox.click();
        Assert.assertTrue(checkBox.secondBox.isSelected());
    }
}
