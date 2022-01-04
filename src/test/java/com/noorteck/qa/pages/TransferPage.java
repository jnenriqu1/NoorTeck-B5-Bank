package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI{

	@FindBy(xpath = "//mat-select[@id='mat-select-0']")
	WebElement dropdownOriginAccount;
			
	@FindBy(xpath = "(//span[normalize-space()='Rainy Day'])[1]")
	WebElement selectRainyDay;
	
	@FindBy(xpath = "//mat-select[@id='mat-select-1']")
	WebElement dropdownDestinationAccount;
	
	@FindBy(xpath = "(//span[normalize-space()='Investing'])[1]")
	WebElement selectInvestingDropDown;
	
	@FindBy(css = "#mat-input-0")
	WebElement AmountField;
	
	@FindBy(css = "#mat-input-1")
	WebElement socialsecurityNumberField;
	
	@FindBy(css = "#mat-input-2")
	WebElement atmField;
	
	@FindBy(xpath = "//span[text()='Transfer Funds']")
	WebElement transferfundsButton;
	
	@FindBy(xpath = "//mat-card-title[@class='mat-card-title']")
	WebElement successfundsxfrMessage;
	
	@FindBy(xpath = "//mat-card-subtitle[@class='mat-card-subtitle']")
	WebElement redirectingyouMessage;
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickdropdownOriginAccount() {
		click(dropdownOriginAccount);
	}
	
	public void selectRainyDayfromDropDown() {
		moveToElementAndClick(selectRainyDay);
	}
	public void dropdownDestinationAccount() {
		click(dropdownDestinationAccount);
	}
	public void selectInvestingfromDropDown() {
		moveToElementAndClick(selectInvestingDropDown);
	}
	public void insertAmountinField(String value) {
		enter(AmountField, value);
	}
	public void insertSocialSecurity(String value) {
		enter(socialsecurityNumberField, value);
	}
	public void insertatmPIN(String value) {
		enter(atmField, value);
	}
	public void selectTransferButton() {
		click(transferfundsButton);
	}
	public void successfundsMessage() {
		getText(successfundsxfrMessage);
	}
	public void redirectingMessage() {
		getText(redirectingyouMessage);
	}
	
}
