package com.cybertek;

import com.github.javafaker.Faker;

public class Batch8 {
	public static void main(String[] args) {
		
		
		
		Faker faker= new Faker();
		
		String creditcard=faker.business().creditCardNumber();
		
		String creditcardtype= faker.business().creditCardType();
		String expdate=faker.business().creditCardExpiry();
		
		String Book= faker.book().title();
		String Book1= faker.book().title();
		
		System.out.println(Book);
	
		
		
		
		
	}
}
