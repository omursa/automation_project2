package dice.com;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=  new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.manage().window().fullscreen();

String url= "https://www.dice.com/";
driver.get(url);

String actualtitle= driver.getTitle();
String expectedtitle= "Find Jobs in Tech | Dice.com";
if(actualtitle.equals(expectedtitle)) {
	System.out.println("Step Pass. Actual title equals expected title");
} else {
	
	System.out.println("Step Fail. Actual title equals expected title");
}



List<String>keywords= new ArrayList<>();
keywords.add("Java");
keywords.add("Python");
keywords.add("Selenium");








String zip= "20001"; 



for (String keyword:keywords) {
	
	
	driver.findElement(By.id("search-field-keyword")).clear();
	driver.findElement(By.id("search-field-keyword")).sendKeys(keyword);
	
	driver.findElement(By.xpath("//input[@id='search-field-location']")).clear();
	driver.findElement(By.xpath("//input[@id='search-field-location']")).sendKeys(zip);

	driver.findElement(By.xpath("//button[@id='findTechJobs']")).click();


	String count = driver.findElement(By.id("posiCountId")).getText();
	System.out.println(keyword + " " +count);
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/a")).click();
	
	
	
}





		
		
	}

}
