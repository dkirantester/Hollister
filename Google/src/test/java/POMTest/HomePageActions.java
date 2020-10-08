package POMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Homepage;

public class HomePageActions {
	
	WebDriver driver=null;
	String URL="https://www.google.co.uk";
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@Test
	public void executeHomepage()
	{
		Homepage homepage=new Homepage(driver);
		homepage.entertextinsearchboxfield("selenium webdriver");
		
	}
	
	
	@Test
	public void executeclicksearch()
	{
		Homepage homepage=new Homepage(driver);
		homepage.clicksearchbutton();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
