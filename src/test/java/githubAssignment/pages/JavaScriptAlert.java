package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JavaScriptAlert {

    @FindBy(xpath = "(//*[.='Click for JS Alert'])[2]") public WebElement jsAlert;
    @FindBy(xpath = "(//*[.='Click for JS Confirm'])[2]") public WebElement jsConfirm;
    @FindBy(xpath = "(//*[.='Click for JS Prompt'])[2]") public WebElement jsPrompt;
    @FindBy(id = "result") public WebElement message;

    public JavaScriptAlert(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
