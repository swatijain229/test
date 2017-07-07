package testcase;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public void takesnapshot () throws exception()

WebDriver driver = new FirefoxDriver();

driver.get("http://demo.guru99.com/V4/");

this.takeSnapShot(driver, "c://test.png");  



public static void TestGuru99TakeScreenShot(WebDriver webdriver,String fileWithPath) throws Exception{

      TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("c://test.png");

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

}

}