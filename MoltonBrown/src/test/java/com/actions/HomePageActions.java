package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.Homepage;

public class HomePageActions {
	
	
	WebDriver driver;
	String URL="https://www.moltonbrown.co.uk";
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void ActionsinHomepage()
	{
		Homepage homepage=new Homepage(driver);
		homepage.clicksearchicon();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.entertextintosearchfield("hand");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.clicksearchicon();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.clickmyaccount();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
