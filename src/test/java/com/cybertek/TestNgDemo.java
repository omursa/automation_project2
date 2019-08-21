package com.cybertek;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {

	@BeforeClass

	public void setup() {

		System.out.println("This class runs before class");
	}

	
	
	@BeforeClass

	public void setup2() {

		System.out.println("This class runs before class and run again");
	}

	
	
	@AfterClass

	public void tearDown() {

		System.out.println("This class runs afterclass");
	}

	@BeforeMethod

	public void initial() {

		System.out.println("Baslangic");
	}

	@Test

	public void test2() {

		System.out.println("secondtest");
	}

	@Test

	public void test1() {

		System.out.println("firsttest");
	}

	@AfterMethod
	public void tearDownMethod() {
		System.out.println("methoddansonra");
	}

}
