package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicContent {

    @FindBy(xpath = "(//*[@class='large-10 columns'])[1]")
    public WebElement firstText;

    @FindBy(xpath = "(//*[@class='large-10 columns'])[2]")
    public WebElement secondText;

    @FindBy(xpath = "(//*[@class='large-10 columns'])[3]")
    public WebElement thirdText;

    public DynamicContent() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
