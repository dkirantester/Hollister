package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.HomePage;

public class HomePageActions {
	
	WebDriver driver;
	String URL="https://www.hollisterco.com/shop/uk";

	
	@BeforeClass
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void executeHomePage()
	{
		HomePage homepage=new HomePage(driver);
		homepage.closeAlert();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//homepage.clickSearch();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.clickMyAccount();
	}
	
	
	
	
	@AfterClass
	public void TearDown()
	{
		driver.close();
	}
}
