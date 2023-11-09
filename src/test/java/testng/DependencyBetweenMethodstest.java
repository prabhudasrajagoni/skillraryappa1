package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyBetweenMethodstest {
 @Test
 public void navigateToApp( ) {
	 System.setProperty("webdriver.chromedriver","./src/main/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement logo = driver.findElement(By.className("atLogoImg"));
	
	if ( logo.isDisplayed())
		System.out.println("Pass");
	else
		System.out.println("fail");
	driver.close();
		
 }
  
 @Test(dependsOnMethods="navigateToApp")
 public void loginToApp();
   System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
   WebDriver driver = new ChromeDriver ();
   driver.manage().window(). maximize();
   driver .get("https://demo.actitime.com/login.do");
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   
   driver.foindElement(By.id("username"))
    .sendKeys("admin"+Keys.TAB+ "manager"+Keys.ENTER);
   drver.close();
   