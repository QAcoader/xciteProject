package com.xcite.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xcite.actiondriver.Action;
import com.xcite.base.BaseClass;

public  class IndexPage extends BaseClass{
	
	
	@FindBy (xpath = "//div[contains(@class, 'relative z-50')]")
	WebElement signin;
	
	@FindBy (id= "search-box")
	WebElement searchProductBox;
	
	public  IndexPage()
	{
		PageFactory.initElements((WebDriver) driver, this);
		
	}
	
	public  LoginPage clickOnSignIn() throws Throwable
	{

Action action = new Action();
action.click(driver, signin);
		return new LoginPage();
		
	}
	
	
	public void ValidateLogo() {
	
	}
	
	
	public String getPageTitle()
	{
		String websiteTitle = ((WebDriver) driver).getTitle();
		return websiteTitle;
	}

	
	public SearchResultPage searchProduct(String productName)
	{
		Action action = new Action();
		action.type(searchProductBox, productName);
		action.click(driver, searchProductBox);
		return new SearchResultPage();
	}
}
