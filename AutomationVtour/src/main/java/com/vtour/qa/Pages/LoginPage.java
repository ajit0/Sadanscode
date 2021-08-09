package com.vtour.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.vtour.qa.Base.VtourBase;

public class LoginPage extends VtourBase {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatethepagetitle() {
		return driver.getTitle();
	}

	public String Verifymobilenumber() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9873880099");
		Thread.sleep(5000);
		String javascript ="document.querySelector(\"#page > div > app-login > div > section > div > div.row.login-wrapper > div.col-md-5 > div > div.login-form.text-left > form > div.form-group.customcheckbox > label\").click();";		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		WebElement element = (WebElement) jsExecutor.executeScript(javascript);
//	WebElement checkbox= driver.findElement(By.id("acceptterms"));
//	Actions act= new Actions(driver);
//	act.moveToElement(checkbox).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(3000);
		return driver.getCurrentUrl();

	}

	public String validateOtp() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.id("pin6")).sendKeys("1");
		driver.findElement(By.id("pin5")).sendKeys("2");
		driver.findElement(By.id("pin4")).sendKeys("3");
		driver.findElement(By.id("pin3")).sendKeys("4");
		driver.findElement(By.id("pin2")).sendKeys("5");
		driver.findElement(By.id("pin1")).sendKeys("6");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(5000);
		return driver.getCurrentUrl();

	}

}
