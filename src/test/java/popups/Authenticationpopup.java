package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authenticationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setproperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new chromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(10, Timeunit.SECONDS);
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath(null))
				
				System.out.println(text);
		driver.close();
		
		
		

	}

}
