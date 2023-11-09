package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framespractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(signin).perform();
		 
		 driver.findElement(By.xpath("//a[text()='login']")).click();
		 
		 driver.switchTo().frame("loginIframe");
		 
		 driver.findElement(By.id("username")).sendKeys("6304797056");
		 driver.findElement(By.id("close-pop")).click();
		 
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.name("keyword")).sendKeys("shoes");
		 driver.findElement(By.className("searchTextSpan")).click();
		 
		 Thread.sleep(3000);
		 driver.close();


	}

}
