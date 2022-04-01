package com.maven.testAutomation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Third {
	@BeforeTest
	public void three() {
		System.out.println("Before 3");
	}
	@Test
	public void threeOne()
	{
		System.out.println("3 1st");
	}
	
	@Test
	public void threeTwo()
	{
		System.out.println("3 2nd");
		System.out.println("Hello World!");
	}

}
