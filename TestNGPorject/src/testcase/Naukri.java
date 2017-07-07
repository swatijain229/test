package testcase;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Naukri {

	public static void main(String[] args) {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.naukri.com");
	  
	  driver.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Set<String> ss =driver.getWindowHandles();
	  System.out.println(ss.size());
	  
	  /*
	  for(String window : ss)
	  {
		  driver.switchTo().window(window);
		  String title = driver.getTitle();
		  System.out.println("title");
	  
		  //{
			  if(title.contains("prokarma"))
			  {
			  		  //	driver.close();
			  }
	  	}
	  
	  */
	  
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
	  driver.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys("swatijain229@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("test123");
	  driver.findElement(By.xpath(".//*[@id='lgnFrm']/div[8]/button")).click();
	  driver.findElement(By.xpath(".//*[@id='loginLB']/div[2]")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  WebElement el = driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(el).perform();
	  driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/div/ul/li[1]/a")).click();
	  
	  //String title = driver.getTitle();
	  
	  //System.out.println("new title : "+title);
	   //driver.navigate("https://my.naukri.com/Profile/edit?id=&0000000altresid"); 
	   driver.findElement(By.xpath(".//*[@id='leftNav_updateProfile']/ul/li/a[1]")).click();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(".//*[@id='experienceYear']")).sendKeys("s");
	  	
	  
	}

}

