package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//li[2]//a[1]")
	WebElement transferButton;

	@FindBy(xpath = "//li[4]//a[1]")
	WebElement loansButton;

	@FindBy(xpath = "//ul[@class='navigation-items']//a[@type='button']")
	WebElement logoutButton;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}
	
	public void selecttransferButton() {
		click(transferButton);
	}
	
	public void selectloansButton() {
		click(loansButton);
	}
	
	public void selectlogoutButton() {
		click(logoutButton);
	}
}
