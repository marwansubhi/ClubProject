package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']/i")
    public WebElement loginButton;


    @FindBy(id = "flash")
    public WebElement message;

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
