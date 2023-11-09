package Listeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

		// TODO Auto-generated constructor stub
		@BeforeSuite
		public void suiteConfig() {
			System.out.println("Beforesuite");
		}
		
		@BeforeTest
		public void testconfig() {
			System.out.println("BeforeTest");
		}
		@BeforeClass
		public void classconfig() {
			System.out.println("BeforeClass");
		}
		@BeforeMethod
		public void methodconfig() {
			System.out.println("BeforeMethod");
		}
@AfterMethod
public void methodTearDown() {
	System.out.println("AfterMethod");
}

@AfterClass
public void ClassTearDown() {
	System.out.println("AfterClass");
}

@AfterTest
public void testTearDown() {
	System.out.println("AfterTest");
}

@AfterSuite
public void suiterTearDown() {
	System.out.println("AfterSuite");
}
}
	
	
	
	
	
	
	
	

