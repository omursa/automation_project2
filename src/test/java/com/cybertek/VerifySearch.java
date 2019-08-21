package com.cybertek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySearch {

  public static void main(String[] args) {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  String url= "https://www.etsy.com/";
	  driver.get(url);
	  
	  driver.findElement(By.id("global-enhancements-search-query")).sendKeys("kutahya"+ Keys.ENTER);
	 // driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']")).sendKeys("kutahya");
	  
	  
	  driver.findElement(By.className("wt-input-btn-group__btn")).click();
	  


	  
	  
	 String currenturl= driver.getCurrentUrl();
	  System.out.println(currenturl);
	  
	  if(currenturl.contains("kutahya")) {
		  
		  System.out.println("pass");
	  } else {
		  
		  System.out.println("fail");
	  }
	  
	  
	  
	  
	  
  }
}
