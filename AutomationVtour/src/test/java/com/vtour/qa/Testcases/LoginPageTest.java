package com.vtour.qa.Testcases;

import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.vtour.qa.Base.VtourBase;
import com.vtour.qa.Pages.LoginPage;

public class LoginPageTest  extends VtourBase{
	LoginPage loginpage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeSuite
	 public void setUp()
	   {
		   initilization();
		   loginpage= new LoginPage();
		    
	   }
	@Test(priority = 1)
	public void logpagetitle() 
	{
		
		String title =  loginpage.validatethepagetitle();
		Assert.assertEquals(title, "Vtour");
	}
    @Test(priority = 2)
	public void validateInfo() throws Exception
	{
		
		String pageurl=loginpage.Verifymobilenumber();
		Assert.assertEquals(pageurl, "https://vtourweb.microlent.com/web/userverification");
	}
	@Test(priority = 3)
	public void verifyOtp() throws Exception
	{
		String currentpage= loginpage.validateOtp();
		Assert.assertEquals(currentpage, "https://vtourweb.microlent.com/web/finishsigning");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
