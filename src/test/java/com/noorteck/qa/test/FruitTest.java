package com.noorteck.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FruitTest {
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test()
	public void cucumber() {
		System.out.println("\tcucumber");
	}

	@Test(priority = 99)
	public void apple() {
		System.out.println("\tapple");
	}

	@Test(priority = 2)
	public void orange() {
		System.out.println("\torange");
	}

	@Test(priority = 11)
	public void banana() {
		System.out.println("\tbanana");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");

	}

}
