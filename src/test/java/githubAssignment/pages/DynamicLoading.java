package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicLoading {

    @FindBy(xpath = "//*[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//*[.='Hello World!']/h4")
    public WebElement helloWorld;

    public DynamicLoading(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
