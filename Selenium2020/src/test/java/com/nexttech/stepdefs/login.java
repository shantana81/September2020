package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.signin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	WebDriver driver;

	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//"driver name","path of driver"
		  driver = new ChromeDriver();
		  
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   //how to open url?
		  driver.get("https://demo.oscommerce.com");
		}
		catch(Exception e) {
			System.out.println("browser or url not opening");
		}
	    
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
		signin obj1=new signin(driver);
		obj1.MyAccount().click();
		
	    
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		signin obj1=new signin(driver);
		obj1.EmailAddress().sendKeys(arg1);
		WebDriverWait wait=new WebDriverWait(driver,10);
		
	  obj1.Password().sendKeys(arg2);
	  WebDriverWait wait1=new WebDriverWait(driver,20);
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		signin obj1=new signin(driver);
		obj1.Signin().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
	 
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
		signin obj1=new signin(driver);
		obj1.myaccountinfo().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^user click on Log off button for logout$")
	public void user_click_on_Log_off_button_for_logout() throws Throwable {
		signin obj1=new signin(driver);
		obj1.Signout().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
	@When("^user enter invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enter_invalid_and_valid(String arg1, String arg2) throws Throwable {
		signin obj1=new signin(driver);
		obj1.EmailAddress().sendKeys(arg1);
		WebDriverWait wait=new WebDriverWait(driver,20);
		
	  obj1.Password().sendKeys(arg2);
	  WebDriverWait wait3=new WebDriverWait(driver,20);
	}
	

}	
	
	

