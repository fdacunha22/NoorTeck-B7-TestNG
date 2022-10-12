package com.noorteck.qa.test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.noorteck.qa.pages.AmazonHomePage;
import com.noorteck.qa.pages.EbayHomePage;
import com.noorteck.qa.utils.CommonUI;

public class AmazonTest extends CommonUI{
	
 

	@Test
	@Parameters({ "browser", "url2" })
	public void test1(String browser, String url) throws InterruptedException {
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		AmazonHomePage amazonObj = new AmazonHomePage(ui.driver);
		
		Thread.sleep(2000);
		amazonObj.enterSearchValue("Java Book");
		amazonObj.clickSearchButton();
		
		
		Thread.sleep(3000);
		ui.driver.quit();
	}

	
	@Test
	@Parameters({ "browser", "url2" })
	public void test2(String browser, String url) throws InterruptedException {
		
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		AmazonHomePage amazonObj = new AmazonHomePage(ui.driver);
		
		Thread.sleep(2000);
		amazonObj.enterSearchValue("Selenium Book");
		amazonObj.clickSearchButton();
		
		
		Thread.sleep(3000);
		ui.driver.quit();
	}
	
	
	@Test
	@Parameters({ "browser", "url2" })
	public void test3(String browser, String url) throws InterruptedException {
		
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		AmazonHomePage amazonObj = new AmazonHomePage(ui.driver);
		
		Thread.sleep(2000);
		amazonObj.enterSearchValue("SQL Book");
		amazonObj.clickSearchButton();
		
		
		Thread.sleep(3000);
		ui.driver.quit();
	}
	
	
	
	@Test
	@Parameters({ "browser", "url2" })
	public void test4(String browser, String url) throws InterruptedException {
		
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		AmazonHomePage amazonObj = new AmazonHomePage(ui.driver);
		
		Thread.sleep(2000);
		amazonObj.enterSearchValue("API Book");
		amazonObj.clickSearchButton();
		
		Thread.sleep(3000);
		ui.driver.quit();
	}
	
	
 
}
