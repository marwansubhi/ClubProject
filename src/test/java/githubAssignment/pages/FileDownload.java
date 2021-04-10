package githubAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FileDownload {

    @FindBy(xpath = "//*[@href='download/some-file.txt']")
    public WebElement someFile;

    @FindBy(xpath = "//*[@href='download/toUpload.txt']")
    public WebElement toUpload;

    public FileDownload(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
