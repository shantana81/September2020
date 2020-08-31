package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class course {
	WebDriver driver;
	public course(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//content
@FindBy(xpath="//a[@class='menulink']")
	
WebElement hover_content;
public WebElement hover_content() {
	return hover_content;
	
}
//courses
@FindBy(xpath="//*[@id='headermenudesktop']/ul/li/ul/li[2]/a")
WebElement click_courses;
public WebElement click_courses() {
	return click_courses;
	
}



}
