package com.noorteck.qa.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUI extends Constants{
	
	public  void openBrowser(String browser) {
		try {

			switch (browser.toLowerCase()) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			}

		} catch (Exception e) {
			System.out.println("Browser has [" + browser + "] value. Make sure to pass [chrome/ie/firefox]");
			e.printStackTrace();

		}
	}

}
