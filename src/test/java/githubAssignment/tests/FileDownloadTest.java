package githubAssignment.tests;

import githubAssignment.pages.FileDownload;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utilities.BrowserUtils;
import utilities.Driver;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDownloadTest {

    FileDownload fd = new FileDownload();
    @Test
    public void test(){

        //File Download
        //
        //Test clicks on the file.
        //Test asserts that the file is downloaded.

        Driver.getDriver().get("http://localhost:7080/download");
        fd.someFile.click();

        String path = "C:\\Users\\Owner\\Downloads\\";

        String fileName = "some-file.txt";

        BrowserUtils.wait(3);
        Assert.assertTrue(isFileDownloaded(path, fileName));
        System.out.println();



    }

    public boolean isFileDownloaded(String downloadPath, String fileName){

        boolean flag = false;

        File dir = new File(downloadPath);

        File[] contents = dir.listFiles();

        for (int i =0; i<contents.length ; i++){

            if (contents[i].getName().contains(fileName)){
                flag = true;
                contents[i].delete();
               break;
            }
        }
      return flag;
    }

}
