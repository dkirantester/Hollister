package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebElement element;
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail(String email)
	{
		email().sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		password().sendKeys(password);
	}
	
	public void loginButton()
	{
		login().click();
	}
	
	
	public void forgotPassword()
	{
		forgotpassword().click();
	}
	
	
	public void registerButtonClick()
	{
		registerbutton().click();
	}
	
	
	public WebElement email()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"mainBar\"]/div/main/app-registration/section/div/div/div[1]/div/form/div[1]/input"));
		
	}
	
	public WebElement password()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"mainBar\"]/div/main/app-registration/section/div/div/div[1]/div/form/div[2]/input"));
		
	}
	
	public WebElement login()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"mainBar\"]/div/main/app-registration/section/div/div/div[1]/div/form/div[3]/button"));
		
	}
	
	public WebElement forgotpassword()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"mainBar\"]/div/main/app-registration/section/div/div/div[1]/div/form/p[4]/a"));
		
	}
	
	public WebElement registerbutton()
	{
		return element=driver.findElement(By.xpath("	//*[@id=\"mainBar\"]/div/main/app-registration/section/div/div/div[3]/div/div/button"));
		
	}
	

}
