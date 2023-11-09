package Crossbrowserparallel;

import org.testng.annotations.Test;

import testng.BaseClass;

public class SwiggTest extends BaseClass {
	
	@Test
	public void test() throws Interruptedexception {
		driver.get("https://www.swiggy.com");
		Thread.sleep(3000);
	}

}
