package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.Callus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactus {
	WebDriver driver;
	
	@Given("^user goes to homepage$")
	public void user_goes_to_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");   
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://demo.oscommerce.com");
	}
	
	@Given("^user clicks contact us button$")
	public void user_clicks_contact_us_button() throws Throwable {
Callus obj1=new Callus(driver);
obj1.Contactus().click();
	}

	
	
	

	@When("^user types their \"([^\"]*)\"$")
	public void user_types_their(String arg1) throws Throwable {
	  Callus obj1=new Callus(driver);
	  obj1.Fullname().sendKeys(arg1);
	   
	}

	@When("^user types valid \"([^\"]*)\"$")
	public void user_types_valid(String arg1) throws Throwable {
	  Callus obj1=new Callus(driver) ;
	  obj1.EmailAddress().sendKeys(arg1);
	  
	   
	}

	@When("^User types an \"([^\"]*)\"$")
	public void user_types_an(String arg1) throws Throwable {
		Callus obj1=new Callus(driver) ;
		obj1.Enquiry().sendKeys(arg1);
	   
	}

	@Then("^user click the continue button and send the information$")
	public void user_click_the_continue_button_and_send_the_information() throws Throwable {
		Callus obj1=new Callus(driver) ;
		obj1.Continue().click();
	}
	     
	   
	}


