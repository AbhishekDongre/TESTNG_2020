package package_testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_001 {
	  WebDriver driver;
	 @BeforeClass
	  public void startUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();

	  }
	  
	 @AfterClass
     public void close() {
	  driver.close();
     }
	  @Test(priority=1)
	  public void tc001() throws Exception{
	  driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	  System.out.println("Application opened"); //JAVA : Console
	  Reporter.log("Application Opened"); //TestNG : htmlReport
	  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(3000);
	  }
	 
	  
	  @Test(priority=3)
	  public void logout() {
	 
	 driver.findElement(By.linkText("Logout")).click();;
	  }
     @Test(priority=2)
     public void drpdwn() throws Exception {
    	 driver.switchTo().frame("rightMenu");
    	 Select st=new Select(driver.findElement(By.name("loc_code")));
    	 st.selectByValue("0");
    	 Thread.sleep(3000);
    	 driver.findElement(By.name("loc_name")).sendKeys("3673");
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//input[@value='Search']")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//input[@type='checkbox'][@value='3673']")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//input[@value='Delete']")).click();
    	 Thread.sleep(3000);
    	 driver.switchTo().defaultContent();
     }
	  	}

	  

	  
	  
	 
	  
	 
	 