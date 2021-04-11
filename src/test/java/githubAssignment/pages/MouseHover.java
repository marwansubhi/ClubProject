package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MouseHover {

    @FindBy(xpath = "(//img)[2]") public WebElement firstImage;
    @FindBy(xpath = "(//img)[3]") public WebElement secondImage;
    @FindBy(xpath = "(//img)[4]") public WebElement thirdImage;

    @FindBy(xpath = "(//h5)[1]") public WebElement text1;
    @FindBy(xpath = "(//h5)[2]") public WebElement text2;
    @FindBy(xpath = "(//h5)[3]") public WebElement text3;

    public MouseHover(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
