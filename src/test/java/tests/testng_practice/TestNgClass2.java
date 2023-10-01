package tests.testng_practice;

import org.testng.annotations.Test;

public class TestNgClass2 {
	
	@Test(groups = { "sanity", "smoke" })
	public void dtest1() {
		System.out.println("I am test1");
	}

	@Test(groups = { "sanity" }, dataProvider = "", invocationCount = 5)
	public void ctest2() {
		System.out.println("I am test2");
	}
}
