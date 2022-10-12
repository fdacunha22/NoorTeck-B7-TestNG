package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoginPage extends CommonUI{
	
	//inspect and username, password & login button
	
	@FindBy(name = "username")
	WebElement usernameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String value) {

		usernameField.sendKeys(value);

	}

	public void enterPassword(String value) {
		passwordField.sendKeys(value);
	}

	public void clickLogin() {

		loginButton.click();
	}
}