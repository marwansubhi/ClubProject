package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WindowHandle {

    @FindBy(xpath = "//*[.='Click Here']") public WebElement link;

    public WindowHandle(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
