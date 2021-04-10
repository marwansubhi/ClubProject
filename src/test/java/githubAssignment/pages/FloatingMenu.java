package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FloatingMenu {

    @FindBy(xpath = "//*[@id='menu']")
    public WebElement floatingBar;

    @FindBy(xpath = "//*[@href='http://elementalselenium.com/']")
    public WebElement bottomLink;

    public FloatingMenu(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
