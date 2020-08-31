package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class service {
	
	WebDriver driver;
	
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
		//how to open browser?
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//"driver name","path of driver"
		  driver = new ChromeDriver();
		  
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   //how to open url?
		  driver.get("https://www.amazon.com");

	}
	
	
		
	

	@When("^user click on customer service$")
	public void user_click_on_customer_service() throws Throwable {
	}

	@When("^user click on digital service and device support$")
	public void user_click_on_digital_service_and_device_support() throws Throwable {
		
	}

	@Then("^user should redirect to digital service and device support$")
	public void user_should_redirect_to_digital_service_and_device_support() throws Throwable {
	}


}
