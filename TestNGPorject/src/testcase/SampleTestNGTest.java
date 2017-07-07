package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SampleTestNGTest {
  @Test
  public void verifytitle () {
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = "";
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeTest
  public void beforeTest() {
	WebDriver driver   = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	
	  
  }
  @AfterTest
 public void afterTest() {
	  WebDriver driver = new FirefoxDriver();
	  driver.quit();
  }
}


