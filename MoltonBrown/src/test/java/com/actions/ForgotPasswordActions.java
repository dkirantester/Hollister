package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.Homepage;
import com.pages.Login;

public class ForgotPasswordActions {
	
	WebDriver driver;
	String URL="https://www.moltonbrown.co.uk";
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	
	@Test (priority=0)
	public void homepagetests()
	{
		Homepage homepage=new Homepage(driver);
		homepage.clickmyaccount();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	@Test (priority=1)
	public void forgotpasswordtests()
	{
		Login login=new Login(driver);
		login.forgotPassword();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println(driver.getTitle());
		driver.close();
	}
	
}
