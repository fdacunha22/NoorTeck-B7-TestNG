package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.Constants;

public class EbayHomePage extends CommonUI {
	@FindBy(id = "gh-ac")
	WebElement searchField;

	@FindBy(id = "gh-btn")
	WebElement searchButton;

	// constructor
	public EbayHomePage(WebDriver driver) {
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
