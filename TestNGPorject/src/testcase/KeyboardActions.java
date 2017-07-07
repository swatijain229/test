package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class KeyboardActions {
static WebDriver driver;
@BeforeTest

public void getbrowser(){
driver = new FirefoxDriver();

driver.get("https://www.facebook.com");
}
@Test
public void gettheelement(){
WebElement txt = driver.findElement(By.xpath(".//*[@id='email']"));
Actions act = new Actions(driver);
Action builder = act.moveToElement(txt).click().keyDown(txt, Keys.SHIFT).sendKeys(txt , "hello").keyUp(txt, Keys.SHIFT).doubleClick(txt).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build();
builder.perform();
                 
}
 
@AfterTest
public void closebrowser(){
	driver.close();
	driver.quit();
}

}




	
	


