package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.Homepage;
import com.pages.Login;

public class RegisterActions {
	
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
	
	
	@Test
	public void homepageactions()
	{
		Homepage homepage=new Homepage(driver);
		homepage.clickmyaccount();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void registerActions()
	{
		Login login=new Login(driver);
		login.registerButtonClick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println(driver.getTitle());
		driver.close();
	}

}
