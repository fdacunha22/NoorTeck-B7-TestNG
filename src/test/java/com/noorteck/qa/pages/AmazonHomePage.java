package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AmazonHomePage  extends CommonUI{
	@FindBy(xpath = "//*[@id ='twotabsearchtextbox']")
	WebElement searchField;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchButton;

	// constructor
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// methods
	public void enterSearchValue(String searchInput) {
		searchField.sendKeys(searchInput);
	}

	public void clickSearchButton() {
		searchButton.click();
	}
}
