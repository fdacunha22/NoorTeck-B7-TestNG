package com.noorteck.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.noorteck.qa.pages.EbayHomePage;
import com.noorteck.qa.utils.CommonUI;

public class EbayTest extends CommonUI{
	
 

	@Test
	@Parameters({ "browser", "url" })
	public void test1(String browser, String url) throws InterruptedException {
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		EbayHomePage ebayObj = new EbayHomePage(ui.driver);
		
		Thread.sleep(2000);
		ebayObj.enterSearchValue("Java Book");
		ebayObj.clickSearchButton();
		
		
		Thread.sleep(3000);
		ui.driver.quit();
	}

	
	@Test//(enabled = false)
	@Parameters({ "browser", "url" })
	public void test2(String browser, String url) throws InterruptedException {
		
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		EbayHomePage ebayObj = new EbayHomePage(ui.driver);
		
		Thread.sleep(2000);
		ebayObj.enterSearchValue("Selenium Book");
		ebayObj.clickSearchButton();
		
		
		Thread.sleep(3000);
		ui.driver.quit();
	}
	
	
	@Test
	@Parameters({ "browser", "url" })
	public void test3(String browser, String url) throws InterruptedException {
		
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		EbayHomePage ebayObj = new EbayHomePage(ui.driver);
		
		Thread.sleep(2000);
		ebayObj.enterSearchValue("SQL Book");
		ebayObj.clickSearchButton();
		
		
		Thread.sleep(3000);
		ui.driver.quit();
	}
	
	
	
	@Test
	@Parameters({ "browser", "url" })
	public void test4(String browser, String url) throws InterruptedException {
		
		CommonUI ui = new CommonUI();
		ui.openBrowser(browser);
		ui.driver.get(url);
		
		EbayHomePage ebayObj = new EbayHomePage(ui.driver);
		
		Thread.sleep(2000);
		ebayObj.enterSearchValue("API Book");
		ebayObj.clickSearchButton();
		
		Thread.sleep(3000);
		ui.driver.quit();
	}
	
	
 
}
