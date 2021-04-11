package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Iframe {

    @FindBy(id = "mce_0_ifr")
    public WebElement childFrame;

    @FindBy(id = "tinymce")
    public WebElement body;

    public Iframe(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
