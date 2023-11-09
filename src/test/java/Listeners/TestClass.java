package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners()

public class TestClass extends BaseClass {
	@Test
	public void Test0() {
		System.out.println("@Test - test0");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test0")
	public void test1() {
		System.out.println("@Test - test1");
	}
	}

	