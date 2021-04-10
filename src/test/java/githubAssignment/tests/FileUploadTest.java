package githubAssignment.tests;

import githubAssignment.pages.FileUpload;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utilities.Driver;

public class FileUploadTest {

    FileUpload fl = new FileUpload();
    @Test
    public void test(){

        //File Upload
        //
        //Test uses Upload Button or Drag and Drop to upload a file.
        //Test asserts that the file is uploaded.

        Driver.getDriver().get("http://localhost:7080/upload");

        fl.chooseFile.sendKeys("C:\\Users\\Owner\\Downloads\\ToBeUploaded.txt");

        fl.upload.click();

        Assert.assertEquals(fl.uploadedText.getText(),"File Uploaded!");

    }
}
