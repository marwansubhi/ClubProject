package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicControl {

    @FindBy(xpath = "//*[.='Remove']")
    public WebElement removeButton;

    @FindBy(xpath = "//*[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement message;

    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement enableButton;

    public DynamicControl(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
