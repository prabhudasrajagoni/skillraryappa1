package Crossbrowserparallel;

import org.testng.annotations.Test;

import testng.BaseClass;

public class GoogleTest extends BaseClass {

	@Test
	public void test() throws intrruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}
}
