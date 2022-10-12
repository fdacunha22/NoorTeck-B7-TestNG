package com.noorteck.qa.test;

import org.testng.annotations.Test;

import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.utils.CommonUI;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class LoginTest extends CommonUI{
	// declare loginPage obj
		LoginPage loginObj;
		CommonUI ui;

		@BeforeClass
		@Parameters({ "browser", "url" })
		public void beforeClass(String browser, String url) {

			ui = new CommonUI();
			ui.openBrowser(browser);	
			ui.driver.get(url);

		}

		@Test
		@Parameters({ "username", "password" })
		public void f(String username, String password) throws InterruptedException {
			loginObj = new LoginPage(ui.driver);
			
			Thread.sleep(3000);
			loginObj.enterUsername(username);
			loginObj.enterPassword(password);
			loginObj.clickLogin();
		}

		@AfterClass
		public void afterClass() throws InterruptedException {

			Thread.sleep(3000);
			ui.driver.quit();
		}
}
