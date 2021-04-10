package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContextMenu {

    @FindBy(id = "hot-spot")

    public WebElement box;

    public ContextMenu(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
