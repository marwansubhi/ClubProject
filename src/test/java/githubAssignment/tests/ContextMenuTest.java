package githubAssignment.tests;

import githubAssignment.pages.ContextMenu;
import io.cucumber.java.bs.I;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BrowserUtils;
import utilities.Driver;

public class ContextMenuTest {

    ContextMenu contextMenu = new ContextMenu();
    @Test
    public void test(){


        //Context Menu
        //
        //Test right clicks on the context menu.
        //Test asserts the alert menu text.
        //http://localhost:7080/context_menu

        Driver.getDriver().get("http://localhost:7080/context_menu");

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(contextMenu.box).contextClick().build().perform();

        Alert alert = Driver.getDriver().switchTo().alert();

        Assert.assertTrue(alert.getText().equals("You selected a context menu"));

        alert.accept();

    }


    @Test
    public void dragAndDrop(){

        //Drag and Drop
        //
        //Test drags element A to element B.
        //Test asserts that the text on element A and B are switched.


       // Driver.getDriver().get("http://localhost:7080/drag_and_drop");

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        WebElement draggable = Driver.getDriver().findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropTarget = Driver.getDriver().findElement(By.xpath("//*[@id='droptarget']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(draggable,dropTarget).build().perform();



//        WebElement boxA = Driver.getDriver().findElement(By.id("column-a"));
//        WebElement boxB = Driver.getDriver().findElement(By.id("column-b"));
//
//        System.out.println(boxA.getText());
//        System.out.println(boxB.getText());
//
//        Actions actions = new Actions(Driver.getDriver());
//
//       // actions.dragAndDrop(boxA,boxB).build().perform();
//
//        actions.clickAndHold(boxA).pause(2).moveToElement(boxB).release().build().perform();
//
//
//        System.out.println("****************");
//        System.out.println(boxA.getText());
//        System.out.println(boxB.getText());
    }
}





















