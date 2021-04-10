package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckBox {

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public WebElement firstBox;


    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement secondBox;

    public CheckBox(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
