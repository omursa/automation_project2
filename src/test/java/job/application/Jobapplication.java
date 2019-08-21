package job.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jobapplication {
	
	
	WebDriver driver;
	String url="https://forms.zohopublic.com/murodil/form/JobApplicationForm/formperma/kOqgtfkv1dMJ4Df6k4_mekBNfNLIconAHvfdIk3CJSQ";
	
	

	String firstName;
	String lastName;
	String gender;
	String dateOfBirth;
	String email;
	String phoneNumber;
	String city;
	String state;
	String country;
	int annualSalary;
	List<String> technologies;
	int yearsOfExperience;
	int education;
	String github;
	List<String> certifications;
	String additionalSkills;
	Faker data = new Faker();
	Random random = new Random();
	
	
	
	@BeforeClass
	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@BeforeMethod
	
	public void navigateToHomePage() {
		driver.get(url);
		
		firstName=data.name().firstName();
		lastName=data.name().lastName();
		gender=data.demographic().sex();
		dateOfBirth=data.date().birthday().toString();
		email="omursahin43@gmail.com";
		phoneNumber= data.phoneNumber().cellPhone();
		city=data.address().city();
		state=data.address().state();
		country= data.address().country();
		//annualSalary=data.number().numberBetween(50000, 150000)
		
		
		technologies= new ArrayList<>();
		
		technologies.add("Java-Expert");
		technologies.add("HTML-Proficient");
		technologies.add("Selenium WebDriver-Beginner");
		technologies.add("TestNG-Expert");
		technologies.add("Git-Expert");
		
		technologies.add("Maven-Beginner");
		technologies.add("JUnit-Beginner");
		technologies.add("Cucumber-" + data.number().numberBetween(1, 3));
		technologies.add("API Automation-" + data.number().numberBetween(1, 3));
		technologies.add("JDBC-" + data.number().numberBetween(1, 3));
		technologies.add("SQL-" + data.number().numberBetween(1, 3));
		
		yearsOfExperience=data.number().numberBetween(1, 10);
		education=data.number().numberBetween(1,4);
		github="www.github.com";
		
		certifications=new ArrayList<>();
		certifications.add("AWS");
		certifications.add("Scrum Master");

		additionalSkills=data.job().keySkills();
		
		
	}
	
	@Test
	public void submitFull() {
		driver.findElement(By.xpath("//input[@name='Name_First']")).sendKeys(firstName);
		driver.findElement(By.name("Name_Last")).sendKeys(lastName);

		if (gender.equals("Male")) {
			driver.findElement(By.id("Radio_1")).click();
		} else {
			driver.findElement(By.id("Radio_2")).click();
		}

		setdateofBirth(dateOfBirth);
		
		setDateOfBirth(dateOfBirth);

		driver.findElement(By.xpath("//input[@name='Email']")).clear();
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='countrycode']")).sendKeys(phoneNumber);
		
        driver.findElement(By.name("Address_City")).sendKeys(city);
        
        driver.findElement(By.name("Address_Region")).sendKeys(state);
        
        
        
        System.out.println(country);
        Select countryElem= new Select(driver.findElement(By.id("Address_Country")));
        
        countryElem.selectByVisibleText(country);
        
       //
        
        
	}

	
	//@AfterMethod
	public void tearDown() {
		driver.close();
	}
	// Mon Sep 14 21:18:35 EDT 1959

	public void setdateofBirth(String dbirth) {
		String[] pieces = dbirth.split(" ");
		String birthday = pieces[2] + "-" + pieces[1] + "-" + pieces[5];
		driver.findElement(By.className("date")).sendKeys(birthday);

	}
	
	
	public void setDateOfBirth(String bday) {
		String[] pieces = bday.split(" ");
		String birthDay = pieces[2] + "-" +  pieces[1] + "-" + pieces[5];
		driver.findElement(By.xpath("//input[@id='Date-date']")).sendKeys(birthDay);
	}
	 
}
