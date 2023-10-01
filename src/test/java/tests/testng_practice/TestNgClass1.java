package tests.testng_practice;

import org.testng.annotations.Test;

public class TestNgClass1 {
	@Test(groups = { "smoke", "regression" })
	public void btest1() {
		System.out.println("I am test1");
	}

	@Test(groups = { "regression" }, dataProvider = "", invocationCount = 5)
	public void atest2() {
		System.out.println("I am test2");
	}

	@Test(priority = 1, dependsOnMethods = {"b"}, groups = {"smoke"} )
	private void a() {
		System.out.println("a method");
	}
	
	@Test(priority = 2)
	private void b() {
		System.out.println("b method");
	}
}
