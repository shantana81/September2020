package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Callus {
	WebDriver driver;
	
public Callus(WebDriver driver)	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}	
@FindBy (xpath="//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")

WebElement Click_Contactus;

public WebElement Contactus() {
	return Click_Contactus;
	
}
@FindBy(name="Fullname")
WebElement Type_Fullname;
public WebElement Fullname() {
	return Type_Fullname;
	
}
@FindBy(name="EmailAddress")
WebElement Type_EmailAddress;
public WebElement EmailAddress() {
	return Type_EmailAddress;
}
@FindBy(name="Enquiry")
WebElement Type_Enquiry;
public WebElement Enquiry() {
	return Type_Enquiry;
	
}

@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")	
WebElement Click_Continue;
public WebElement Continue() {
	return Click_Continue;
	
}











}
