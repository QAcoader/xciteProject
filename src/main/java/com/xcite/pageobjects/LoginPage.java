/**
 * 
 */
package com.xcite.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xcite.actiondriver.Action;
import com.xcite.base.BaseClass;



/**
 * @author gjadhav
 *
 */
public class LoginPage extends BaseClass {
	
	
	@FindBy(id = "username")  ////*[@id="username"]
	WebElement username;
	
	
	@FindBy(id = "pass")
	WebElement password;
	
	
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/nav/div[5]/form/div[1]/div[2]/button/span")
	WebElement submitButton;



public LoginPage()
{
	PageFactory.initElements(driver, this);
}
public HomePage login() {
	Action.type(username, username);
	
	Action.type(password, pass );
}


}
