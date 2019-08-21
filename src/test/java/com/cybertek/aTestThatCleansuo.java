package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aTestThatCleansuo {

	WebDriver driver;

	
	
	@BeforeMethod
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}
	@Test


	public void searchAmazon() {

		

		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fathers day" + Keys.ENTER);

		Assert.assertTrue(driver.getTitle().contains("Fathers day"));

	}
	
	@Test
	
	public void searchGoogle(){
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Fathers day" + Keys.ENTER);
		
		Assert.assertTrue(driver.getTitle().contains("Fathers day"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}
