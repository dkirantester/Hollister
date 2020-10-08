package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebElement element;
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void closeAlert()
	{
		alert().click();
	}
	
	public void clickSearch()
	{
		search().click();
	}
	
	public void clickMyAccount()
	{
		myaccount().click();
	}
	
	
	public WebElement alert()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"cam\"]/div[2]/div/div[1]/button/span[2]"));
		
	}
	
	public WebElement search()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"product-search-form-desktop\"]/div/div/div/div/div/button"));
	}
	
	
	public WebElement myaccount()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"rs-header\"]/div[3]/nav/div[4]/div/div[4]/ul/li[2]/a/span[1]"));
		
	}
	
	

}
