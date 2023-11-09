package datadriventesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.CryptoServicesRegistrar.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class actiloginscriptusingproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver,chrome.driver","./src/test/resources/data.properties");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(read("url"));

long time = Long.parseLong(read("timeouts"));
driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

driver.findElement(By.id("username")).sendKeys(read("username"));
driver.findElement(By.name("pwd")).sendKeys(read("password"));
driver.findElement(By.id("loginButton")).click();

WebDriverwait = new WebDriverwait(driver,time);
wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
driver.close();

	}
public static String read(String Key) {
	FileInputyStream fis = null;
	try {
		fis = new FileInpjutStream("../src/test/resources/data.properties");
	}Catch (FileNotFoundException e){
		e.printStackTrace();
	}
	Properties property = new Properties();
	try {
		Property.load(fis);
	}catch (IOException e) {
		e.printStackTrace();
	}
	return Property.getProperty(key);
	
	
	}
}

