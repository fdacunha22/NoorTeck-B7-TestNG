package com.noorteck.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class ParameterTest {
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test
	@Parameters({ "firstName", "lastName" })
	public void test1(String f, String l) {
		System.out.println("Test Case !:");
		System.out.println("First Name: " + f);
		System.out.println("Last Name: " + l);
	}

	@Test
	@Parameters({ "firstName", "state", "country" })
	public void test2(String f, String s, String c) {
		System.out.println("firstName: " + f);
		System.out.println("State: " + s);
		System.out.println("Country: " + c);

		/**
		 * This method should take 3 parameters' FirstName, State & Country
		 */

	}

	@Test
	@Parameters({ "city", "state", "country", "zipcode", "carName" })
	public void test3(String city, String s, String c, String z, String carName) {

		System.out.println("City: " + city);
		System.out.println("State: " + s);
		System.out.println("Country: " + c);
		System.out.println("Zipcode: " + z);
		System.out.println("CarName: " + carName);
		/**
		 * This method should take 5 parameters City, State & country, zipcode, carName
		 * 
		 * in the body print each parameter value
		 */

	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
