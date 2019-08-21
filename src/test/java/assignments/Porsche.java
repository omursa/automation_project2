package assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Porsche {


	WebDriver driver;
	String url= "https://www.porsche.com/usa/";
	
	
	@Test
	
	public void porscheTest() {
	
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get(url);
		
		String xpath= "//div[@class='m-107-info__headline']";
		
		List<WebElement>myelements= driver.findElements(By.xpath(xpath));
		
		
		for(WebElement myelement: myelements) {
			System.out.println(myelement.getText());
			
			if(myelement.getText().equals(718)) {
				driver.findElement(By.xpath("//div[@class='m-107-info__headline']"))
				
				
			}
		}
		//driver.findElement(By.xpath("//a[@class='m-101__text m-101__menuitem__text'])[1]")).click();
		//driver.findElement(By.xpath("//div[@data-attr='modelrange']//label[1]")).click();
		
	
		
		//div[@class='m-107-info__headline']
		//div[@class='m-107-info__price']
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}
	
	

}
