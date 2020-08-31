package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreorderPOM {
	WebDriver driver;
	public PreorderPOM  (WebDriver driver)	{
		this.driver=driver;
			PageFactory.initElements(driver,this);

}
	
@FindBy(xpath="//*[@id=\"bh-app\"]/section/div/div[1]/ul/li[3]/span/span")
WebElement click_dotThingy;
public WebElement dot() {
	return click_dotThingy;
}
	
//click preoder
	@FindBy(xpath="//*[@id=\"bh-app\"]/section/div/div[1]/div/div/div[3]/div/div/div/div/div/div/map/area[2]")
	WebElement click_preorder;
	public WebElement preorder() {
		return click_preorder;
		
	}
	
	
	
	
	
	
	
	
}



