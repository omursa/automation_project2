package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String url = "https://www.google.com/";
		driver.get(url);

		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("Some more text" + Keys.ENTER);

	}
	
	private static void method(WebDriver driver) {
		
	}

}
