package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	WebDriver driver;
	@Test
	public void clickdropdown() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://mrbool.com");
		 Actions act=new Actions(driver); 
		 Thread.sleep(2000);
		 act.moveToElement(driver.findElement(By.xpath("//*[@id='headermenudesktop']/ul/li/a"))).build().perform();  
		 Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='headermenudesktop']/ul/li/ul/li[2]/a")).click();
	}

}
