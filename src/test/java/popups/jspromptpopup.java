package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jspromptpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperties("webdriver.chrome.driver\",\"./src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement

	}

}
