package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI{

	@FindBy(xpath = "//input[@placeholder='First name, Last name']")
	WebElement nameField;
	
	@FindBy(css = "//input[@placeholder='Street, City, Zip Code']")
	WebElement addressField;
	
	@FindBy(xpath = "(//div[@class='mat-form-field-flex'])[3]")
	WebElement dropdownLoanType;
	
	@FindBy(xpath = "(//span[normalize-space()='Retirement'])[1]")
	WebElement retirementfromDropDown;
	
	@FindBy(css = "input[placeholder='Ex. 1 Year']")
	WebElement yearstorepayField;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy(css = "input[placeholder='Ex. 10000']")
	WebElement amountField;
	
	@FindBy(css = "input[placeholder='Ex. Smith']")
	WebElement mothermaidennameField;
	
	@FindBy(css = "input[placeholder='Format: XXX-XX-XXXX']")
	WebElement socialsecuritynumberField;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement aboutyourloanbackButton;
	
	@FindBy(css = "button[type='submit']")
	WebElement aboutyourloannextButton;
	
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement confirmconfirmButton;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement backconfirmButton;
	
	@FindBy(xpath = "//span[text()='Reset']")
	WebElement resetconfirmButton;
	
	@FindBy(xpath ="//mat-card-title[@class='mat-card-title']")
	WebElement loansSubmissionSuccessMessage;
	
	public LoansPage() {
		PageFactory.initElements(driver, this);
	}
	public void enternameField(String value) {
		enter(nameField, value);
	}
	public void enteraddressField(String value) {
		enter(nameField, value);
	}
	public void selectdropdownloanType() {
		click(dropdownLoanType);
	}
	public void selectRetirementfromDropDown() {
		moveToElementAndClick(retirementfromDropDown);
	}
	public void enteryearField(String value) {
		enter(yearstorepayField, value);
	}
	public void clicknextafteryeartorepayButton() {
		click(nextButton);
	}
	public void enterAmountField(String value) {
		enter(amountField, value);
	}
	public void entermothersNameField(String value) {
		enter(mothermaidennameField, value);
	}
	public void entersocialsecurityField(String value) {
		enter(socialsecuritynumberField,value);
	}
	public void clickBackButtononAboutYourLoan() {
		click(aboutyourloanbackButton);
	}
	public void clickNextButtononAboutYourLoan() {
		click(aboutyourloannextButton);
	}
	public void clickConfirmButton() {
		click(confirmconfirmButton);
	}
	public void clickBackConfirmButton() {
		click(backconfirmButton);
	}
	public void clickResetConfirmButton() {
		click(resetconfirmButton);
	}
	public void submissionSuccessMessage() {
		getText(loansSubmissionSuccessMessage);
	}
	
}
