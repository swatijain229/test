package testcase;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest 
{
	WebDriver driver = null;
	
	
  @Test(priority=0,dataProvider = "dp", groups={"g1"})
  public void f(String uid, String pwd, String other) { 

	  dirver = new FirefoxDriver();
	  
	  dirver.get("https://www.google.com/");
	  
	  System.out.println(uid+"\t"+pwd+"\t"+other);
  }
  
  @Test(priority=2,groups={"g2"} ) //enabled=false
  public void abc()
  {
	  System.out.println("test abc");
  }
  
  @Test(priority=1,groups={"g1"})
  public void xyz()
  {
	  System.out.println("test xyz");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bm");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("am");
  }


  @DataProvider
  public Object[][] dp() 
  {	  
			  
    return new Object[][] 
    		{
    	
		    	new Object[] { "abc@gmail.com","abc123", ""},
		    	new Object[] { "xyz@gmail.com","zyz123", ""},
		    	new Object[] { "44444@gmail.com","3333", "" },
		    	new Object[] { "eeee@gmail.com","eerr", "" },
		    	
    		};
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
