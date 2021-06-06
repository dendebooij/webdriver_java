package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class UploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("C:\\\\Repositories\\WebDriver\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded file incorrect");
    }
}