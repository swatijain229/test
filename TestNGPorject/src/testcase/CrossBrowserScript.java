package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserScript {

		WebDriver driver;
		@BeforeTest
		@Parameters("browser")
		public void setup(String browser) throws Exception{
			
			if(browser.equalsIgnoreCase("firefox")){
			 driver = new FirefoxDriver();
			}
			
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
			}
			
		else {
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void testParameterWithXML() throws InterruptedException{
			driver.get("http://demo.guru99.com/V4/");
			//Find user name
			WebElement userName = driver.findElement(By.name("uid"));
			//Fill user name
			userName.sendKeys("guru99");
			//Find password
			WebElement password = driver.findElement(By.name("password"));
			//Fill password
			password.sendKeys("guru99");
		}
	}

