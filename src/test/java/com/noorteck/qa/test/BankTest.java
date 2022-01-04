package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
						
		String url ="https://usdemo.vee24.com/#/transactions";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		banktestcaseOne();
		CommonUI.quitBrowser();
	
		String urlTwo = "https://usdemo.vee24.com/#/transactions";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(urlTwo);
		initializeClassObj();
		banktestcaseTwo();
		
		CommonUI.quitBrowser();
		
	}
	
	public static void banktestcaseOne() {
		homeObj.selecttransferButton();//3
		transferObj.clickdropdownOriginAccount();//4 ?????
		transferObj.selectRainyDayfromDropDown();//4 ?????
		transferObj.dropdownDestinationAccount();//5
		transferObj.selectInvestingfromDropDown();//5
		transferObj.insertAmountinField("1000");//6
		transferObj.insertSocialSecurity("12345677");//7
		transferObj.insertatmPIN("1235");//8
		transferObj.selectTransferButton();//9
		transferObj.successfundsMessage();//10
	}
	
	public static void banktestcaseTwo() {
		homeObj.selectloansButton();//3
		loansObj.enternameField("John Cena");//4
		loansObj.enteraddressField("123 Java drive");//5
		loansObj.selectdropdownloanType();//6
		loansObj.selectRetirementfromDropDown();//6
		loansObj.enteryearField("2");//7
		loansObj.clicknextafteryeartorepayButton();//8
		loansObj.enterAmountField("5000");//9
		loansObj.entermothersNameField("Kim");//10
		loansObj.entersocialsecurityField("123456778");//11
		loansObj.clickNextButtononAboutYourLoan();//12
		loansObj.clickConfirmButton();//13
		loansObj.submissionSuccessMessage();//14
		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/