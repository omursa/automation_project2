package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {

	
	WebDriver driver;
	String str ="Selenium Testing Tools Cookbook";
	
	@Test
	public void amazonSearch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(str + Keys.ENTER);
	}
	
	
	
}
