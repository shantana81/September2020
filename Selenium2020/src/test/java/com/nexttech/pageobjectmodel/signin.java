package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {
	WebDriver driver;
	
public signin(WebDriver driver)	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}	

	

@FindBy(xpath="//*[@id=\"tdb5\"]/span[2]")

WebElement click_MyAccount;

public WebElement MyAccount() {
	return click_MyAccount;
	
}
@FindBy(name="email_address")
WebElement Type_EmailAddress;

public WebElement EmailAddress() {
	return Type_EmailAddress;
}
@FindBy(name="password")
WebElement Type_Password;

public WebElement Password() {
	return Type_Password;
	
}
@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
WebElement Click_Signin;
public WebElement Signin() {
	return Click_Signin;
	
}

@FindBy(xpath="")
WebElement Txt_myaccountinfo;
public WebElement myaccountinfo() {
	return Txt_myaccountinfo;
}
@FindBy(xpath="")
WebElement Click_Signout;
public WebElement Signout() {
	return Click_Signout;
}
}


