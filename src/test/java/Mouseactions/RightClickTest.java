package Mouseactions;

import org.openqa.selenium.WebDriver;

public class RightClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new chromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlywait(10,Timeunit.SECONDS);
		
		WedElement deals=driver.findElement(By.xpath
				
				)
		)

	}

}
