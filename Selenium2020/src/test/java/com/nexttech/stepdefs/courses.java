package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.course;
import com.nexttech.pageobjectmodel.signin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class courses {
	WebDriver driver;

@Given("^user navigates the homepage$")
public void user_navigates_the_homepage() throws Throwable {
	try {
	BrowserFactory bf = new BrowserFactory();
	bf.startBrowser("chrome","http://mr.bool.com");
	
	  driver = new ChromeDriver();
	  
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	  driver.get("http://mrbool.com");  
	}
	catch (Exception e) {
		System.out.println("browser or url not opening");
	}
}

@When("^user hover over the content drop down$")
public void user_hover_over_the_content_drop_down() throws Throwable {
	try {
	course obj1=new course(driver);
	Actions act = new Actions(driver);
	obj1.hover_content();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	act.moveToElement(driver.findElement(By.xpath("//*[@id='headermenudesktop']/ul/li/a"))).build().perform(); 
	}
	catch(Exception e){
		System.out.println("the drpodown didnt work");
	}
}

@When("^user can successully click courses button$")
public void user_can_successully_click_courses_button() throws Throwable {
	try {
 course obj1=new course(driver);
 obj1.click_courses().click();
 WebDriverWait wait = new WebDriverWait(driver, 15);
	}
	catch(Exception e) {
	System.out.println("courses didnt work");
	}
}

@Then("^User successfully goes to courses page$")
public void user_successfully_goes_to_courses_page() throws Throwable {
   
}



}
