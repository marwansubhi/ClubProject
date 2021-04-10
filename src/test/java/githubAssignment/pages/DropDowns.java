package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DropDowns {

    @FindBy(xpath = "//*[@id='dropdown']")

    public WebElement select;

    public DropDowns(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
