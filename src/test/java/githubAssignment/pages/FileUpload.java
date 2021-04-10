package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FileUpload {

    @FindBy(xpath = "//*[@id='file-upload']")
    public WebElement chooseFile;

    @FindBy(xpath = "//*[@id='file-submit']")
    public WebElement upload;

    @FindBy(xpath = "//h3")
    public WebElement uploadedText;

    public FileUpload(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
