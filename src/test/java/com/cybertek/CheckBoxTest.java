package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {

	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		String url= "https://the-internet.herokuapp.com/checkboxes";
		
		driver.get(url);
		
		
		
		
	}
}
